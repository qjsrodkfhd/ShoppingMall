package shoppingMall.User.View;

import java.util.Scanner;

import shoppingMall.mainController.MainController;

public class DeleteUserView {
	
	private Scanner keyboard;
	
	
	public DeleteUserView(){
		
		keyboard = new Scanner(System.in);
		
	}

	
	public void deleteUserView(){
		
		System.out.println("회원 영구 삭제 메뉴 입니다.");
		System.out.println("삭제할 회원의 번호를 입력하세요");
		int deleteUserNumber = keyboard.nextInt();
		
		MainController.getUserController().requestDeleteUserData(deleteUserNumber);
		
	}
}
