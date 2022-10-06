package view;

import controller.PlayerController;

public class StartView {
	public static void main(String[] args) {
		System.out.println("=== 모든 검색 ===");
		PlayerController.request(1);
		
		System.out.println("\n=== 플레이어 검색 ===");
		PlayerController.request(2);
		
		System.out.println("\n=== 새로운 플레이어 등록 ===");
		PlayerController.request(3);
//		PlayerController.request(3);
//		PlayerController.request(1);	// 등록 됐는지 모든 검색으로 확인
		
		System.out.println("\n=== 플레이어 정보 삭제 ===");
		PlayerController.request(4);
//		PlayerController.request(1);	// 삭제 됐는지 모든 검색으로 확인
		
		System.out.println("\n=== 플레이어 매칭 ===");
		PlayerController.request(5);
		
		System.out.println("\n=== 총 플레이어 수 ===");
		PlayerController.request(6);
	}
}
