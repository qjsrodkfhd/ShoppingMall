package shoppingMall.Login.Controller;

import shoppingMall.Login.Dao.LoginDao;
import shoppingMall.Login.View.LoginView;
import shoppingMall.Login.Vo.Login;

public class LoginController {

	private LoginDao loginDao;


	public LoginController(){

		loginDao = new LoginDao();

	}


	public void requestLogin(){

		LoginView loginView = new LoginView();
		loginView.loginView();


	}


	public void requestLoginData(Login login){

		boolean success = loginDao.login(login);

		if(success){

			System.out.println("로그인 성공");

		}else{

			System.out.println("로그인 실패");
		}

	}
}