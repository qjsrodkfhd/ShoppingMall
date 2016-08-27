package shoppingMall.Login.Dao;

import shoppingMall.Login.Repository.LoginRepository;
import shoppingMall.Login.Vo.Login;
import shoppingMall.User.Repository.UserRepository;

public class LoginDao {

	// constructor
	public LoginDao(){

		new LoginRepository();
		
	}


	// 로그인
	public int login(Login login){

		int loginUserNumber = -1;
		
		for(int i = 0; i<UserRepository.getUsers().size(); i++){
	
			if(login.getUserID().equals(UserRepository.getUsers().get(0).getUserID())&&
					login.getUserPW().equals(UserRepository.getUsers().get(0).getUserPW())){
					LoginRepository.setLogin(login);
				
				loginUserNumber = 0;
				return loginUserNumber;
				
			}
			
			if(login.getUserID().equals(UserRepository.getUsers().get(i).getUserID())&&
					login.getUserPW().equals(UserRepository.getUsers().get(i).getUserPW())){
					LoginRepository.setLogin(login);
					LoginRepository.setLoginUserNumber(i);
					
				loginUserNumber = i;
				break;
			}			
		}		
		
		return loginUserNumber;
		
	}
	
	
	// 로그인상태 체크
	public boolean checkLogin(){
		
		boolean success = false;
		
		Login login = LoginRepository.getLogin();
		
		if(login != null){
			
			success = true;
			return success;
			
		} else {
			
			return success;
			
		}
		
	}


	// 로그아웃
	public boolean logOut(){
		
		boolean success = false;
		
		LoginRepository.setLogin(null);
		success = true;
		
		//상품 장바구니 널값이 필요함
		
		return success;	
		
	}

}
