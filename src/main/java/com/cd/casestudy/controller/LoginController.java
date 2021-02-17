package com.cd.casestudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cd.casestudy.serviceImp.UserService;

@RestController
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	UserService userService;
	
	public String login(@RequestParam String email, String password )
	{
		return "null";
	}
	

	
}
