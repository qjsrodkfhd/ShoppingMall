package shoppingMall.mainView;

import java.util.Scanner;

public class UserMenuView {

	// variable
	Scanner keyboard;
	
	// constructor
	public UserMenuView(){
		
		this.keyboard = new Scanner(System.in);
		
	}

	// method
	// 관리자 메뉴 
	public void userMenuView(){
		
		System.out.println("유저 페이지 입니다");
		
		while(true){
			
			String[] adminMainMenu = {"1. 상품구매", "2. 회원정보관리", "3. 로그 아웃"};
			
			for(int i=0; i<adminMainMenu.length; i++){
				
				System.out.println(adminMainMenu[i]);
				
			}
			
			System.out.println("원하시는 메뉴를 선택해 주십시오 > " );	
			int selectedMenu = keyboard.nextInt();
			
			if(selectedMenu == 1){ // 상품구매
				
				// 상품구매 연결해야함
				
			} else if(selectedMenu == 2){ // 회원정보관리
				
				// 회원정보관리 연결해야함
				
			} else if(selectedMenu == 3){ // 로그아웃
				
				System.out.println("로그아웃 하였습니다");
				MainView mainView = new MainView();
				mainView.mainView();
				
			} else {
				
				System.out.println("잘못입력하셨습니다");
				
			}
			
		}
		
	} // End of userMenuView();
	
}
