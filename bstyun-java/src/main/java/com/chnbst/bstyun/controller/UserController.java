package com.chnbst.bstyun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.chnbst.bstyun.model.pojo.User;
import com.chnbst.bstyun.service.UserService1;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService1 userService1;
	
	
	
	@RequestMapping("")
	@ResponseBody
	public boolean insert(@ModelAttribute User user){
		return userService1.insertUser(user);
		
	}
}
