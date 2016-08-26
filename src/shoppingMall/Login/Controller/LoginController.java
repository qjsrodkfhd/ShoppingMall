package shoppingMall.Login.Controller;

import shoppingMall.Login.Dao.LoginDao;
import shoppingMall.Login.View.LoginView;
import shoppingMall.Login.Vo.Login;
import shoppingMall.mainView.AdminView;
import shoppingMall.mainView.UserMenuView;

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

		int loginUserNumber = loginDao.login(login);

		if(loginUserNumber == 0){

			System.out.println("관리자 로그인 성공");
			AdminView adminMenu = new AdminView();
			adminMenu.adminView();

		}else if(loginUserNumber == -1){

			System.out.println("로그인 실패");
			
		} else {
			
			System.out.println("유저 로그인 성공");
			UserMenuView userMenuView = new UserMenuView();
			userMenuView.userMenuView();
			
		}

	}
}