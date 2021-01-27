package com.cd.casestudy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cd.casestudy.exception.ResourceNotFound;
import com.cd.casestudy.model.User;
import com.cd.casestudy.repository.UserRepository;
import com.cd.casestudy.serviceImp.ValidatorImpl;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private ValidatorImpl validatorImpl;
	
	@Autowired
	private UserRepository userRepository;
    
	@PostMapping("/login")
	public void userLoginCredentials(@RequestParam String email, @RequestParam String password) throws ResourceNotFound {
		validatorImpl.userValidate(email, password);
	}
	
	@PostMapping("/registration")
	public void newUser(@RequestBody User newUser) {
		userRepository.save(newUser);
	}

}
