package shoppingMall.Login.Dao;

import shoppingMall.Login.Repository.LoginRepository;
import shoppingMall.Login.Vo.Login;
import shoppingMall.User.Repository.UserRepository;
import shoppingMall.mainController.MainController;

public class LoginDao {


	public LoginDao(){

		new LoginRepository();
		
	}


	public int login(Login login){

		int loginUserNumber = -1;
		
		for(int i = 0; i<UserRepository.getUsers().size(); i++){
	
			if(login.getUserID().equals(UserRepository.getUsers().get(0).getUserID())&&
					login.getUserPW().equals(UserRepository.getUsers().get(0).getUserPW())){
				
				loginUserNumber = 0;
				return loginUserNumber;
				
			}
			
			if(login.getUserID().equals(UserRepository.getUsers().get(i).getUserID())&&
					login.getUserPW().equals(UserRepository.getUsers().get(i).getUserPW())){
				
				loginUserNumber = i;
				break;
			}			
		}		
		
		return loginUserNumber;
		
	}
	
}
