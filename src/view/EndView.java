package view;

import model.domain.Player;

public class EndView {

	// 모든 데이터 출력
	public static void printAll(Player[] all) {
		for (Player p : all) {
			if (p != null){
				System.out.println(p.getName() + ", " + p.getAge() + ", " + p.getDivision());
			}	
		}
	}
	
	// 한명 출력
	public static void printOne(Player Player) {
		System.out.println("이름: " + Player.getName() + "\n나이: " + Player.getAge() + "\n체급: " + Player.getDivision());
	}
	
	public static void printSuccess(String msg) {
		System.out.println(msg);
	}
	
	public static void printFail(String msg) {
		System.out.println(msg);
	}
	
	public static void printPlayerNumber(int count, String[] players) {
		System.out.println("총 플레이어 수는 " + count + "명 입니다.");
		
		for(String p : players) {
			System.out.println(">> " + p);
		}

	}
}