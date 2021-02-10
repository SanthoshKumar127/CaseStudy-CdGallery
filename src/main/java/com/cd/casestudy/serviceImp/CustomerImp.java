package com.cd.casestudy.serviceImp;

import org.springframework.stereotype.Service;
import com.cd.casestudy.exception.ResourceNotFound;
import com.cd.casestudy.service.Validator;

@Service
public class CustomerImp implements Validator{

	@Override
	public void userValidate(String email, String password) throws ResourceNotFound {
		
		
	}
	
	
}
