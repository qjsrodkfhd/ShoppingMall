package shoppingMall.Login.View;

import java.util.Scanner;

import shoppingMall.Login.Vo.Login;

public class LoginView {
	
	private Scanner keyboard;
	
	
	public LoginView(){
		
		keyboard = new Scanner(System.in);
		
	}

	
	public Login loginView(){ //void
		
		Login login;
		
		System.out.println("로그인");
		
		System.out.println("[I D: ]");
		String ID = keyboard.next();
		
		System.out.println("[P W: ]");
		String PW = keyboard.next();
		
		login = new Login(ID,PW);
		
		//컨트롤러 요청(login)
		
		return login;
		
	}


}
