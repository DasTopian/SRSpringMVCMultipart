package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="TBL_USER1029")
public class User {
	@Id
	private String uname;
	private String tphone;
	private String email;
	private String password;
	private String fileName;
	public User() {
		
	}
	

	public User(UserDTO ud,String fname) {
		this.uname = ud.getUname();
		this.tphone = ud.getTphone();
		this.email = ud.getEmail();
		this.password = ud.getPassword();
		this.fileName = fname;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", tphone=" + tphone + ", email=" + email + ", password=" + password + "]";
	}
	public String getUname() {
		return uname;
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
