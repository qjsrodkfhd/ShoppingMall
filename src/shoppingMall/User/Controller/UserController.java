package shoppingMall.User.Controller;

import shoppingMall.User.Dao.UserDao;
import shoppingMall.User.View.UserView;
import shoppingMall.User.Vo.User;
import shoppingMall.mainView.MainView;

public class UserController {

	private UserDao userDao;


	public UserController(){

		userDao = new UserDao();

	}


	public void requestUserSignUp(){

		UserView userView = new UserView();
		User user = userView.userSignUpView();

		boolean success = userDao.userSignUp(user);

		if(success){

			System.out.println("성공");
			MainView mainView = new MainView();
			mainView.mainView();
			

		}else{

			System.out.println("실패");

		}

	}


}
