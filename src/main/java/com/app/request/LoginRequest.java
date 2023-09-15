package com.app.request;

public class LoginRequest {
	
	private String email;
	private String password;
	private int role;
	
	public int getRole() {
		return role;
	}


	public void setRole(int role) {
		this.role = role;
	}


	public LoginRequest() {
		// TODO Auto-generated constructor stub
	}


	public LoginRequest(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
