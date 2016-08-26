package shoppingMall.Login.Repository;

import shoppingMall.Login.Vo.Login;

public class LoginRepository {
	
	private static Login login;

	
	public LoginRepository(){
		
	}


	public static Login getLogin() {
		return login;
	}


	public static void setLogin(Login login) {
		LoginRepository.login = login;
	}

	
}
