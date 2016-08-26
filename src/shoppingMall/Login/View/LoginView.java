package shoppingMall.Login.View;

import java.util.Scanner;

import shoppingMall.Login.Vo.Login;
import shoppingMall.mainController.MainController;

public class LoginView {
	
	private Scanner keyboard;
	
	
	public LoginView(){
		
		keyboard = new Scanner(System.in);
		
	}

	public void loginView(){

		System.out.println("로그인");
		
		System.out.println("[I D: ]");
		String ID = keyboard.next();
		
		System.out.println("[P W: ]");
		String PW = keyboard.next();
		
		Login login = new Login(ID,PW);
		
		MainController.getLoginController().requestLoginData(login);
		
	}


}
