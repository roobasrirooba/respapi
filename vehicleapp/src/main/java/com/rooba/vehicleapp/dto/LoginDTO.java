package com.rooba.vehicleapp.dto;

public class LoginDTO {

	private String emailId;
	private String password;

	public LoginDTO() {

	}

	public LoginDTO(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String userEmail) {
		this.emailId = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "loginDTO [emailId=" + emailId + ", password=" + password + "]";
	}

}
