package com.cd.casestudy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cd.casestudy.dto.UserDTO;
import com.cd.casestudy.model.User;
import com.cd.casestudy.serviceImp.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/registration")
	public void userRegistration(@RequestBody UserDTO user)
	{
		userService.newUser(user);	
	}
	
	@GetMapping("/alluser")
	public List<UserDTO> allUserDetails(User user)
	{
		
		return userService.allUser(user);
	}
	
	@PostMapping(value = "/user-by-email",produces = "application/json", consumes = "application/json")
	public UserDTO findByEmail(String email)
	{
		return userService.getByEmail(email);
	}
}	
