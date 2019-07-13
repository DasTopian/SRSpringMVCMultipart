package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.lti.component.UserDao;
import com.lti.entity.User;

@Controller
public class LoginController{
	@Autowired UserDao udao;
	 
	@RequestMapping(path="/login", method = RequestMethod.POST)
	public String execute(@RequestParam("uname") String uname,
			@RequestParam("password")String password,
			Map<String,Object> model) {
		List<User> ulist=udao.fetch(uname);
		User uf=ulist.get(0);
		if(password.equals(uf.getPassword()))
		{
			model.put("username", uname);
			String fName=uf.getFileName();
			/*
			 * String path="file:///d:/uploads/"; String finalPath=path+fName;
			 * model.put("path",finalPath);
			 */
			return "welcome.jsp";
		}
		else 
			model.put("message", "Invalid User");
			return "login.jsp";
	}

}
