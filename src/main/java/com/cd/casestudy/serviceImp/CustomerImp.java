package com.cd.casestudy.serviceImp;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cd.casestudy.controller.AlbumController;
import com.cd.casestudy.controller.RentalDetailsController;
import com.cd.casestudy.controller.UserController;
import com.cd.casestudy.exception.ResourceNotFound;
import com.cd.casestudy.model.Album;
import com.cd.casestudy.model.RentalAlbumDetails;
import com.cd.casestudy.model.User;
import com.cd.casestudy.repository.AlbumRepository;
import com.cd.casestudy.repository.RentalRepository;
import com.cd.casestudy.repository.UserRepository;
import com.cd.casestudy.service.Validator;

@Service
public class CustomerImp implements Validator{

	@Override
	public void userValidate(String email, String password) throws ResourceNotFound {
		
		
	}
	
	
}
