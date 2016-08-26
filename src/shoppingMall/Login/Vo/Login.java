package shoppingMall.Login.Vo;

public class Login {
	
	private String userID;
	private String userPW;
	
	
	public Login(){
	
	}


	public Login(String userID, String userPW) {
		
		this.userID = userID;
		this.userPW = userPW;
		
	}


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}


	public String getUserPW() {
		return userPW;
	}


	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}

	
}
