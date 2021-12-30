package com.rguktn.drives.data;

import java.io.Serializable;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserData implements Serializable{

	private static final long serialVersionUID = 1L;
	private String userName;
	private String userId;
	private String userEmail;
	private String password;
	private String dob;
	private Boolean isActive;
	private Set<RoleData> roles;
//	private ResumeData resumeData;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Set<RoleData> getRoles() {
		return roles;
	}
	public void setRoles(Set<RoleData> roles) {
		this.roles = roles;
	}
	
}
