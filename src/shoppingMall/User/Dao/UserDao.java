package shoppingMall.User.Dao;

import java.util.ArrayList;

import shoppingMall.Login.Repository.LoginRepository;
import shoppingMall.User.Repository.UserRepository;
import shoppingMall.User.Vo.User;

public class UserDao {

	// constructor
	public UserDao(){

		new UserRepository();

	}


	// method
	// 가입
	public boolean userSignUp(User userSign){

		boolean success = false;
		
		for(int i=0; i<UserRepository.getUsers().size(); i++){
			if(userSign.getUserID().equals(UserRepository.getUsers().get(i).getUserID())){
				return success;
			}
		}
		
		int currentUserNumber = UserRepository.getLastUserPosition();
		currentUserNumber = currentUserNumber + 1;
		UserRepository.setLastUserPosition(currentUserNumber);
		userSign.setUserNumber(currentUserNumber);

		ArrayList<User> currentUsers = UserRepository.getUsers();
		currentUsers.add(userSign);
		success = true;
		
		return success;

	}


	//중복아이디 체크
	public boolean checkUserId(User userCheckId){

		boolean success = false;

		for(int i=0; i<UserRepository.getUsers().size(); i++){
			if(userCheckId.getUserID() == UserRepository.getUsers().get(i).getUserID()){
				
				return success;
				
			}
		}

		return success;

	}


	//목록
	public ArrayList<User> userList(){

		ArrayList<User> userList;

		userList = UserRepository.getUsers();

		return userList;

	}


	//조회
	public User searchUser(int searchNumber){

		User selectedUser = null;

		for(int i=0; i<UserRepository.getUsers().size(); i++){
			if(searchNumber == UserRepository.getUsers().get(i).getUserNumber()){
				
				selectedUser = UserRepository.getUsers().get(i);
				break;

			}
		}

		return selectedUser;

	}


	//관리자가 탈퇴 시키는거
	public User deleteUser(int searchNumber){

		User deleteUser = null;

		for(int i=0; i<UserRepository.getUsers().size(); i++){
			if(searchNumber == UserRepository.getUsers().get(i).getUserNumber()){
				
				UserRepository.getUsers().remove(i);
				
			}
		}

		return deleteUser;

	}


	//유저정보수정
	public boolean updateUser(User updateUser){

		boolean success = false;

		UserRepository.getUsers().get(LoginRepository.getLoginUserNumber()).setUserAddr(updateUser.getUserAddr());
		UserRepository.getUsers().get(LoginRepository.getLoginUserNumber()).setUserEmail(updateUser.getUserEmail());
		UserRepository.getUsers().get(LoginRepository.getLoginUserNumber()).setUserName(updateUser.getUserName());
		UserRepository.getUsers().get(LoginRepository.getLoginUserNumber()).setUserPW(updateUser.getUserPW());
		UserRepository.getUsers().get(LoginRepository.getLoginUserNumber()).setUserTel(updateUser.getUserTel());

		success = true;
		
		return success;

	}


	//회원탈퇴
	public User withdrawUser(){

		return UserRepository.getUsers().remove(LoginRepository.getLoginUserNumber());

	}

}
