package shoppingMall.Login.Controller;

import shoppingMall.Login.Dao.LoginDao;
import shoppingMall.Login.View.LoginView;
import shoppingMall.Login.Vo.Login;
import shoppingMall.mainView.AdminView;
import shoppingMall.mainView.MainAlertView;
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


	public boolean requestLoginCheack(){
	
		boolean success = loginDao.checkLogin();
		
		if(success=false){
			
			new MainAlertView().alert("로그인 되어있습니다.");
			
		}else{
			
			new MainAlertView().alert("로그인 되어있지 않습니다.");
			
		}
		return success;
		
	}
	
	
	public void requestLogOut(){
		
		boolean success = false;
		
		success = requestLoginCheack();
		
		if(success){
			
			new MainAlertView().alert("로그아웃 되었습니다.");
		
		}

	}

}