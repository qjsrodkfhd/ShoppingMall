package shoppingMall.User.View;

import java.util.Scanner;

import shoppingMall.mainController.MainController;

public class UserManagementMenuView {
	
	private Scanner keyboard;
	
	public UserManagementMenuView(){
		
	 this.keyboard = new Scanner(System.in);
		
	}

	
	public void userManagementMenuView(){
				
		System.out.println("유저관리메뉴");
		System.out.println("1.유저리스트 2.유저조회  3.유저강퇴");
		int selectUserManagementMemu = keyboard.nextInt();
		
		if(selectUserManagementMemu==1){
			
			System.out.println("유저 리스트메뉴 입니다.");
			MainController.getUserController().requestUserList();
	
		}else if(selectUserManagementMemu==2){
			
			System.out.println("유저 조회메뉴 입니다.");
			
		}else if(selectUserManagementMemu==3){
			
			System.out.println("유저 강퇴 메뉴입니다.");
		}
		
		
	}
}
