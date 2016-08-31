package shoppingMall.Login.Repository;

import shoppingMall.Login.Vo.Login;

public class LoginRepository {
	
	// variable
	private static Login login;
	private static int loginUserNumber;

	
	// constructor
	public LoginRepository(){
		
	}

	
	// getter and setter
	public static int getLoginUserNumber() {
		return loginUserNumber;
	}


	public static void setLoginUserNumber(int loginUserNumber) {
		LoginRepository.loginUserNumber = loginUserNumber;
	}


	public static Login getLogin() {
		return login;
	}


	public static void setLogin(Login login) {
		LoginRepository.login = login;
	}

}
