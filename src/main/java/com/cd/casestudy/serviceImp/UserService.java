package com.cd.casestudy.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cd.casestudy.model.User;
import com.cd.casestudy.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public void newUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
    public List loginCredentials(@RequestParam String email, @RequestParam String password)
    {
    	List userOpt = userRepository.loginCredentials(email, password);
    	return userOpt;
    }
    
    public User getByEmail(String email)
    {
    	return userRepository.findByEmail(email);
    }
}
