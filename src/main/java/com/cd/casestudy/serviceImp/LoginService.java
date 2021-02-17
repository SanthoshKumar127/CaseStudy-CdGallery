package com.cd.casestudy.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cd.casestudy.model.User;
import com.cd.casestudy.repository.UserRepository;


@Service
public class LoginService {
	
	@Autowired
	UserRepository userRepository;

	public String validation(String email, String password) 
	{
		List<User> allUser = (List<User>) userRepository.findAll();
		User userDetails= userRepository.findByEmail(email);
		
		if(userDetails.getRoleId()==1)
		{
			return "Admin";
		}
		else
		{
			return "User";
		}
	
	}

	
}
