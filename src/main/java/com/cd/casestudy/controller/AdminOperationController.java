package com.cd.casestudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cd.casestudy.exception.ResourceNotFound;
import com.cd.casestudy.serviceImp.CustomerImp;

@RestController
@RequestMapping("/api")
public class AdminOperationController {

	@Autowired
	CustomerImp customerImp;
	
	@PostMapping("/login")
	public void login(@RequestParam String email, String password) throws ResourceNotFound
	{
		customerImp.userValidate(email, password);
	}
}
