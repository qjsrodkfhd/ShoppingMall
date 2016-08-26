package shoppingMall.User.Controller;

import java.util.ArrayList;

import shoppingMall.User.Dao.UserDao;
import shoppingMall.User.View.UserListView;
import shoppingMall.User.View.UserSignView;
import shoppingMall.User.Vo.User;
import shoppingMall.mainView.MainView;


public class UserController {

	private UserDao userDao;


	public UserController(){

		userDao = new UserDao();

	}


	public void requestUserSignUp(){

		UserSignView userView = new UserSignView();
		userView.userSignUpView();

	}


	public void requestUserData(User user){


		boolean success = userDao.userSignUp(user);

		if(success){

			System.out.println("성공");
			MainView mainView = new MainView();
			mainView.mainView();

		}else{

			System.out.println("실패");
		}
	}



	public void requestUserList(){

		ArrayList<User> userList = userDao.userList();

		UserListView userListView = new UserListView();
		userListView.userListView(userList); 

	}

}



