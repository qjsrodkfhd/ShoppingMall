package shoppingMall.User.Repository;

import java.util.ArrayList;

import shoppingMall.User.Vo.User;

public class UserRepository {
	
	private static ArrayList<User> users;
	private static int lastUserPosition;
	
	public UserRepository(){
		
		users = new ArrayList<User>();
		lastUserPosition=0;
		User admin = new User("admin","1111", "-", "Admin", "-", 0, "-");
		users.add(admin);
		User testUser = new User("1","1", "1", "1", "1", 1, "1");
		users.add(testUser);
		
	}

	public static ArrayList<User> getUsers() {
		
		return users;
		
	}

	public static void setUsers(ArrayList<User> users) {
		
		UserRepository.users = users;
		
	}

	public static int getLastUserPosition() {
		
		return lastUserPosition;
		
	}

	public static void setLastUserPosition(int lastUserPosition) {
		
		UserRepository.lastUserPosition = lastUserPosition;
		
	}
	

	
}
