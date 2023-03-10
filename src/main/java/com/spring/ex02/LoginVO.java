package com.spring.ex02;

public class LoginVO {

	private String userID;
	private String userName;
	
	public LoginVO(String userID, String userName) {
		super();
		userID = userID;
		userName = userName;
	}
	
	public String getUserID() {
		return userID;
	}
	public void UserID(String userID) {
		userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		userName = userName;
	}

	
	
}
