package com.cd.casestudy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cd.casestudy.serviceImp.UserService;



@RestController
@RequestMapping("/api")
public class AdminOperationController {

	@Autowired
	UserService userService;
	
	@PostMapping("/login")
	public String loginValidation(@RequestParam String email, @RequestParam String password)
	{
		return userService.loginCredentials(email, password);
	}
	
}
