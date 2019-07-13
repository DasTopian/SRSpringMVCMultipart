package com.lti.controller;


import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.component.UserDao;
import com.lti.entity.User;
import com.lti.entity.UserDTO;

@Controller
public class RegisterController {
	
	  @Autowired 
	  UserDao udao;
	 
	@RequestMapping(path="/register",method = RequestMethod.POST)
	public String register(UserDTO userDTO,Map<String,Object> model) {
		
		
		 
		 
		String path="d:/uploads/";
		String fileName=userDTO.getUname()+"_"+userDTO.getFile().getOriginalFilename();
		String finalPath=path+fileName;
		User usr=new User(userDTO,fileName);
		
		try {
		userDTO.getFile().transferTo(new File(finalPath));
		}catch(IOException e) {
			e.printStackTrace();
		}
		 udao.addUser(usr); 
		 model.put("message", "successfully registered"); 
		return "login.jsp";
	}
}
