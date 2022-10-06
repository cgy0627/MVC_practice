package controller;

import model.PlayerModel;
import model.domain.Player;
import view.EndView;
import java.util.Scanner;  // Import the Scanner class

public class PlayerController {
	public static void request(int reqNumber) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//		System.out.println("Enter username");
		
		switch(reqNumber) {
			case 1 :
				EndView.printAll(PlayerModel.getAll());
				break;
			case 2 :
				EndView.printOne(PlayerModel.getOne("SAUL ALVAREZ"));
				break;
			case 3 :
//				boxerName = myObj.nextLine();
				boolean r = PlayerModel.insert(new Player("OLEKSANDR USYK", "heavy", 35));
				if(r) {
					EndView.printSuccess("선수 등록 성공");
				} else {
					EndView.printFail("선수 등록 실패");
				}
				break;
			case 4 :
				PlayerModel.delete("TERENCE CRAWFORD");
				break;
			case 5 :
				PlayerModel.setRound();
				break;
			case 6 :
				EndView.printPlayerNumber(PlayerModel.countPlayers(), PlayerModel.getPlayerNames());
				break;
		}
	}
}