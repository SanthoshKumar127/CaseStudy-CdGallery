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
	
    public String loginCredentials(@RequestParam String email, @RequestParam String password)
    {
    	List<User> userOpt = userRepository.loginCredentials(email, password);
    	if(!userOpt.isEmpty())
    	{
    		User userDetails = userRepository.findByEmail(email);
    		if(userDetails.getRoleId()==1)
    		{
    			return "Admin Operation";
    		}
    		else 
    		{
    			return "Customer";
    		}
    	}
    	else
    	{
    		return "Error Login with correct email and password";
    	}
  
    }
    
    public UserDTO getByEmail(String email)
    {
    	User getByEmail = userRepository.findByEmail(email);
    	return userConverter.entityToDto(getByEmail);
    }
    
    public List<UserDTO> allUser(User user)
    {
    	List<User> userDetails = (List<User>) userRepository.findAll();
    	return userConverter.entityToDto(userDetails);
    }
}
