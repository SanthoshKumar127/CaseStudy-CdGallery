package com.cd.casestudy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cd.casestudy.model.User;
import com.cd.casestudy.serviceImp.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/registration")
	public void userRegistration(@RequestBody User user)
	{
		userService.newUser(user);
	}
	
	@PostMapping("/user-by-email")
	public void findByEmail(@PathVariable ("email") String email)
	{
		userService.getByEmail(email);
	}
}
