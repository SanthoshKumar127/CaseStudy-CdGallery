package com.cd.casestudy.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cd.casestudy.converter.UserConverter;
import com.cd.casestudy.dto.UserDTO;
import com.cd.casestudy.model.User;
import com.cd.casestudy.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserConverter userConverter;
	
	public void newUser(@RequestBody UserDTO user) {
		User newUser = userConverter.dtoToEntity(user);
		userRepository.save(newUser);
	}
	
    public List<User> loginCredentials(@RequestParam String email, @RequestParam String password)
    {
    	List<User> userOpt = userRepository.loginCredentials(email, password);
    	return userOpt;
    }
    
    public UserDTO getByEmail(String email)
    {
    	User getByEmail = userRepository.findByEmail(email);
    	return userConverter.entityToDto(getByEmail);
    }
}
