package shoppingMall.Login.Dao;

import shoppingMall.Login.Repository.LoginRepository;
import shoppingMall.Login.Vo.Login;
import shoppingMall.User.Repository.UserRepository;

public class LoginDao {


	public LoginDao(){

		new LoginRepository();
	
	}


	public boolean login(Login login){

		boolean success = false;

		for(int i = 0; i<UserRepository.getUsers().size(); i++){

			if(login.getUserID().equals(UserRepository.getUsers().get(i).getUserID())&&
					login.getUserPW().equals(UserRepository.getUsers().get(i).getUserPW())){
				success = true;
				break;
			}			
		}		
		
		return success;
		
	}
	
}
