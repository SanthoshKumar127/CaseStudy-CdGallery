package com.cd.casestudy.serviceImp;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.cd.casestudy.controller.AlbumController;
import com.cd.casestudy.controller.RentalDetailsController;
import com.cd.casestudy.exception.ResourceNotFound;
import com.cd.casestudy.model.Album;
import com.cd.casestudy.model.RentalAlbumDetails;
import com.cd.casestudy.model.User;
import com.cd.casestudy.repository.AlbumRepository;
import com.cd.casestudy.repository.UserRepository;
import com.cd.casestudy.service.Validator;

@Service
public class ValidatorImpl implements Validator {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AlbumRepository albumRepository;
	@Autowired
	private AlbumController albumController;
	
	@Autowired
	private CustomerImp customerImp;
	
	@Autowired
     private RentalDetailsController rentalDetailsController;
	
	@Autowired
	private UserImp userImp;
	
	@Override
	public void userValidate(String email, String password) throws ResourceNotFound {
		
		Scanner scan = new Scanner(System.in);
		int s1;
		//customerImp.CustomerValidation(email, password);
		List userOpt = userRepository.loginCredentials(email, password);
		if(!userOpt.isEmpty())
		{
		System.out.println(userOpt);
		User user = userRepository.findByEmail(email);
		if(user.getRoleId()==1)
		{
			
				//System.out.println("User Authenticated");
				userImp.adminOperation();
		}
		else
		{
			customerImp.customerOperation();
		}
		}
		else
		{
			System.out.println("Incorrect customer_id and password");
		}
	}
	
}
