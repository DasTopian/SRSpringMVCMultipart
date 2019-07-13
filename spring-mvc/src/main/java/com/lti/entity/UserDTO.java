package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

//Data Transfer Object
public class UserDTO {

	private String uname;
	private String tphone;
	private String email;
	private String password;
	private MultipartFile file;
	@Override
	public String toString() {
		return "User [uname=" + uname + ", tphone=" + tphone + ", email=" + email + ", password=" + password + "]";
	}
	public String getUname() {
		return uname;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getTphone() {
		return tphone;
	}
	public void setTphone(String tphone) {
		this.tphone = tphone;
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
