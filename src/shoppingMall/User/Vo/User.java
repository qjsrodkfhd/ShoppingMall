package shoppingMall.User.Vo;

public class User {
	
	private int userNumber;
	private String userID;
	private String userPW;
	private String userEmail;
	private String userName;
	private int userAge;
	private String userAddr;
	private String userTel;
	
	
	public User(){
			
		
	}


	public User(String userID, String userPW, String userEmail, 
			String userName,String userAddr, int userAge,String userTel) {
		
		this.userID = userID;
		this.userPW = userPW;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userAddr= userAddr;
		this.userAge = userAge;
		this.userTel = userTel;

	}


	public int getUserNumber() {
		
		return userNumber;
		
	}


	public void setUserNumber(int userNumber) {
		
		this.userNumber = userNumber;
		
	}


	public String getUserPW() {
		
		return userPW;
		
	}


	public void setUserPW(String userPW) {
		
		this.userPW = userPW;
		
	}


	public String getUserEmail() {
		
		return userEmail;
		
	}


	public void setUserEmail(String userEmail) {
		
		this.userEmail = userEmail;
		
	}


	public String getUserName() {
		
		return userName;
		
	}


	public void setUserName(String userName) {
		
		this.userName = userName;
		
	}


	public int getUserAge() {
		
		return userAge;
		
	}


	public void setUserAge(int userAge) {
		
		this.userAge = userAge;
		
	}


	public String getUserAddr() {
		
		return userAddr;
		
	}


	public void setUserAddr(String userAddr) {
		
		this.userAddr = userAddr;
		
	}


	public String getUserTel() {
		
		return userTel;
		
	}


	public void setUserTel(String userTel) {
		
		this.userTel = userTel;
		
	}


	public String getUserID() {
		
		return userID;
		
	}

	
	
}
