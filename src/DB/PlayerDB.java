package DB;

import model.domain.Player;

public class PlayerDB {
	private static Player[] allPlayers = new Player[10];
	private static int index;
	
	private PlayerDB() {}
	
	static {
		allPlayers[0] = new Player("SAUL ALVAREZ", "super middle", 32);
		allPlayers[1] = new Player("DMITRII BIVOL", "light heavy", 31);
		allPlayers[2] = new Player("TERENCE CRAWFORD", "welter", 34);
		allPlayers[3] = new Player("GENNADIY GOLOVKIN", "middle", 40);
		index = 4;
	}
	
	// 메소드 : getters : 외부에서 내부에 생성된 객체에 접근
	public static Player[] getPlayers() {
		return allPlayers;
	}
	
	public static int getIndex() {
		return index;
	}
	
}
