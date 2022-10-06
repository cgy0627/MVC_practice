package model;

import model.domain.Player;
import DB.PlayerDB;
import java.util.Random;

public class PlayerModel {
	
	// 플레이어 DB 불러오기
	static Player[] allPlayers = PlayerDB.getPlayers();
	static int index = PlayerDB.getIndex();
	
	static Random rand = new Random();
	
	// 모든 플레이어 검색
	public static Player[] getAll() {
		return allPlayers;
	}
	
	// 한 플레이어의 정보만 검색
	public static Player getOne(String name) {
		for(Player player : allPlayers) {
			if(player != null && name.equals(player.getName())) {
				return player;
			}
		}
		return null;
	}
	
	// 플레이어 추가하기
	public static boolean insert(Player player) {
		if(allPlayers[index] == null && index < 10) {
			allPlayers[index] = player;
			index += 1;
			return true;
		}
		return false;
	}
	
	// 플레이어 제거하기
	public static boolean delete(String name) {
		for(int i = 0; i < allPlayers.length; i++) {
			if(allPlayers[i] != null && name.equals(allPlayers[i].getName())) {
				allPlayers[i] = null;
				index = i;
				
				System.out.println("플레이어 목록에서 " + name + "이 삭제되었습니다.");
				return true;
			}
		}
		return false;
	}
	
	// 플레이어 수 세기
	public static int countPlayers() {
		int count = 0;
		for(Player player : allPlayers) {
			if(player != null) {
				count++;
			}
		}
		return count;
	}
	
	// 플레이어 이름 array 뽑기
	public static String[] getPlayerNames() {
		String[] playerNames = new String[countPlayers()];
		int count = 0;
		for(Player player : allPlayers) {
			if(player != null) {
				playerNames[count++] = player.getName();
			}
		}
		return playerNames;
	}
	
	// 플레이어 상대할 선수들 정하기!
	public static boolean setRound() {
		int numPlayers = countPlayers();
		if(numPlayers <= 1) {
			System.out.println("플레이어 수가 너무 적어서 게임을 진행할 수가 없습니다.");
			return false;
		}
//		int n = rand.nextInt(numPlayers);
		
		String[] playerNames = getPlayerNames();
		
		int count = 0;
		if(numPlayers % 2 == 0) {
			for(int i = 0; i < playerNames.length; i+=2) {
				System.out.print(++count + ". ");
				System.out.println(playerNames[i] + " vs " + playerNames[i+1]);
			}
		}
		else{
			for(int i = 0; i < playerNames.length-1; i+=2) {
				System.out.print(++count + ". ");
				System.out.println(playerNames[i] + " vs " + playerNames[i+1]);
			}
			System.out.println(playerNames[-1] + "는 상대 선수가 없습니다.");
		}
		return true;
	}
	
}
