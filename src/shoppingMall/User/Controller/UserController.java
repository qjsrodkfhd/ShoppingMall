package shoppingMall.User.Controller;

import java.util.ArrayList;

import shoppingMall.User.Dao.UserDao;
import shoppingMall.User.View.DeleteUserView;
import shoppingMall.User.View.UserListView;
import shoppingMall.User.View.UserManagementMenuView;
import shoppingMall.User.View.UserSearchView;
import shoppingMall.User.View.UserSignView;
import shoppingMall.User.View.UserUpdateView;
import shoppingMall.User.Vo.User;
import shoppingMall.mainView.MainAlertView;
import shoppingMall.mainView.MainView;


public class UserController {

	private UserDao userDao;


	public UserController(){

		userDao = new UserDao();

	}


	//유저메뉴
	public void requestUserMenu(){

		UserManagementMenuView userMenu = new UserManagementMenuView();
		userMenu.userManagementMenuView();

	}


	//회원가입
	public void requestUserSignUp(){

		UserSignView userView = new UserSignView();
		userView.userSignUpView();

	}


	//회원가입 데이터
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


	//유저목록
	public void requestUserList(){

		ArrayList<User> userList = userDao.userList();

		UserListView userListView = new UserListView();
		userListView.userListView(userList); 

	}


	//유저조회
	public void requestUserSearch(){

		UserSearchView userSearch = new UserSearchView();
		userSearch.getSearchNumber();

	}


	//유저조회 데이터
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


	//유저삭제
	public void requestDeleteUser(){

		DeleteUserView deleteUserView = new DeleteUserView();
		deleteUserView.deleteUserView();

	}


	//유저삭제 데이터
	public void requestDeleteUserData(int deleteUserNumber){

		User deleteUser = userDao.deleteUser(deleteUserNumber);

	}


	//유저수정
	public void requestUpdateUser(){

		UserUpdateView userUpdateView = new UserUpdateView();
		userUpdateView.updateUserView();

	}

	
	//유저수정데이터
	public void requestUpdateUserData(User updateContent){


		boolean success = userDao.updateUser(updateContent);

		if(success){

			System.out.println("성공");
			MainView mainView = new MainView();
			mainView.mainView();

		}

	}


}




