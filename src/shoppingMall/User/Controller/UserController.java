package shoppingMall.User.Controller;

import java.util.ArrayList;

import shoppingMall.User.Dao.UserDao;
import shoppingMall.User.View.DeleteUserView;
import shoppingMall.User.View.UserListView;
import shoppingMall.User.View.UserManagementMenuView;
import shoppingMall.User.View.UserSearchView;
import shoppingMall.User.View.UserSignView;
import shoppingMall.User.Vo.User;
import shoppingMall.mainController.MainController;
import shoppingMall.mainView.MainAlertView;
import shoppingMall.mainView.MainView;


public class UserController {

	private UserDao userDao;


	public UserController(){

		userDao = new UserDao();

	}
	
	
	public void requestUserMenu(){
		
		UserManagementMenuView userMenu = new UserManagementMenuView();
		userMenu.userManagementMenuView();
		
	}


	public void requestUserSignUp(){

		UserSignView userView = new UserSignView();
		userView.userSignUpView();

	}


	public void requestUserData(User userSign){


		boolean success = userDao.userSignUp(userSign);

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

	
	public void requestUserSearch(){
		
		UserSearchView userSearch = new UserSearchView();
		userSearch.getSearchNumber();
		
	}
	
	
	public void requestUserSearchData(int getSearchNumber){
		
		 User selectedUser = userDao.searchUser(getSearchNumber);
		 
		 if(selectedUser == null){
			 MainAlertView alertView = new MainAlertView();
			alertView.alert("실패");
			return;
		 }
		 
		 UserSearchView userSearchView = new UserSearchView();
		 userSearchView.outputSearchProduct(selectedUser);
		 
		 
	
	}

	
	public void requestDeleteUser(){
		
		DeleteUserView deleteUserView = new DeleteUserView();
		deleteUserView.deleteUserView();
		
		
	}

	
	public void requestDeleteUserData(int deleteUserNumber){
		
		User deleteUser = userDao.deleteUser(deleteUserNumber);
		
		
		
		
	}
}



