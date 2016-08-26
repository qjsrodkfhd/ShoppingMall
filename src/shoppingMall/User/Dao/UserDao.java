package shoppingMall.User.Dao;

import java.util.ArrayList;

import shoppingMall.User.Repository.UserRepository;
import shoppingMall.User.Vo.User;

public class UserDao {
	
	
	public UserDao(){
		
		new UserRepository();
		
	}

	
	public boolean userSignUp(User user){
		
		boolean success = false;
		
		int currentUserNumber = UserRepository.getLastUserPosition();
		currentUserNumber = currentUserNumber++;
		UserRepository.setLastUserPosition(currentUserNumber);
		
		user.setUserNumber(currentUserNumber);
		
		ArrayList<User> currentUsers = UserRepository.getUsers();
		currentUsers.add(user);
		
		success = true;
		
		return success;
		
		
	}
}
