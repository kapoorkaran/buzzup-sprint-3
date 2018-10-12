package com.stackroute.buzzup.kafka.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private String emailId;
	private String password;
	private String userRole;
	private String userName;
	

	public User() {
	}

	

public User(String email, String password, String role, String userName) {
		super();
		this.emailId = email;
		this.password = password;
		this.userRole = role;
		this.userName = userName;
	}



//	public Long getUserId() {
//		return userId;
//	}
//
//	public void setUserId(Long userId) {
//		this.userId = userId;
//	}

	public String getEmail() {
		return emailId;
	}

	public void setEmail(String email) {
		this.emailId = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

//	public Long getPhoneNumber() {
//		return phoneNumber;
//	}
//
//	public void setPhoneNumber(Long phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}

	public String getRole() {
		return userRole;
	}

	public void setRole(String role) {
		this.userRole = role;
	}

}




