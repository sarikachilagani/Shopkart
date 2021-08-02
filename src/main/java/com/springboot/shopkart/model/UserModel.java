package com.springboot.shopkart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserDetails")
public class UserModel {

	@Id
	private Long userId;
	private String userNmae;
	private String mail;
	private String password;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserNmae() {
		return userNmae;
	}
	public void setUserNmae(String userNmae) {
		this.userNmae = userNmae;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserModel(Long userId, String userNmae, String mail, String password) {
		super();
		this.userId = userId;
		this.userNmae = userNmae;
		this.mail = mail;
		this.password = password;
	}
	public UserModel() {
		super();
		
	}
	
	
}
