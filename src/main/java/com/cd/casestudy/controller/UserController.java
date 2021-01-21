package com.cd.casestudy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cd.casestudy.model.User;
import com.cd.casestudy.repository.UserRepository;
import com.cd.casestudy.serviceImp.ValidatorImpl;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private ValidatorImpl validatorImpl;
    
	@PostMapping("/login")
	public void userLoginCredentials(@RequestParam long customer_id, @RequestParam String password) {
		validatorImpl.userValidate(customer_id, password);
	}
}
