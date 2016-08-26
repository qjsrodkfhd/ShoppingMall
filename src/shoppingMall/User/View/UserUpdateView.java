package shoppingMall.User.View;

import java.util.Scanner;

import shoppingMall.User.Vo.User;
import shoppingMall.mainController.MainController;

public class UserUpdateView {
	
private Scanner keyboard;
	
	
	public UserUpdateView(){
		
		keyboard = new Scanner(System.in);
		
	}

	
	public void updateUserView(){
		
		
		System.out.println("수정할 값을 입력하세요");
		
		System.out.println("[이 름: ]");
		String userName = keyboard.next();
		
		System.out.println("[P W: ]");
		String userPW = keyboard.next();
		
		System.out.println("[E-MAIL: ]");
		String userEmail = keyboard.next();
		 
		System.out.println("[주 소: ]");
		String userAddr = keyboard.next();
		
		System.out.println("[전화번호: ]");
		String userTel = keyboard.next();
		
		User updateUser = new User(null,userPW, userEmail, userName, userAddr, 0, userTel);
		
		MainController.getUserController().requestUpdateUserData(updateUser);
		
		
	}
	
}
