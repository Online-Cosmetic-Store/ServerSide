package com.app.response;

public class AuthResponse {
	
	private String jwt;
	
	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	private boolean status;
	
	private int role;
	
	public AuthResponse() {
		// TODO Auto-generated constructor stub
	}

	public AuthResponse(String jwt, boolean status) {
		super();
		this.jwt = jwt;
		this.status = status;
		//this.role=role;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
