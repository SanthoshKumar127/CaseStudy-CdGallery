package com.cd.casestudy.serviceImp;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.cd.casestudy.controller.AlbumController;
import com.cd.casestudy.controller.RentalDetailsController;
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
    RentalDetailsController rentalDetailsController;
	
	@Override
	public void userValidate(long customer_id, String password) {
		
		Scanner scan = new Scanner(System.in);
		int s1;
	List userOpt = userRepository.loginCredentials(customer_id, password);
		if(!userOpt.isEmpty())
		{
			System.out.println("User Authenticated");
			do
			{
				System.out.println("Enter the option");
				System.out.println("1. Add New Album");
				System.out.println("2. View Album");
				System.out.println("3. View Rental Details");
				
				int choice = scan.nextInt();
				
				switch(choice)
				{
				case 1 : System.out.println();
						Album album  = new Album();
						System.out.println("Enter the Album Title");
						String aTitle = scan.next();
						album.setAlbumTitle(aTitle);
						System.out.println("Enter the Album Category");
						long cid = scan.nextLong();
						album.setCategoryId(cid);
						System.out.println("Enter the Hire Price");
						double price = scan.nextDouble();
						album.setHirePrice(price);
						System.out.println("Enter No Of Cd");
						int noOfCd = scan.nextInt();
						album.setNoOfCd(noOfCd);
						System.out.println("Enter the Status");
						String status = scan.next();
						album.setStatus(status);
						albumController.createAddAlbum(album);
				break;
				
				case 2: System.out.println();
						List availableAlbum = albumController.getAllAlbum();
						System.out.println(availableAlbum);
				break;
				case 3: System.out.println();
	                    List rentDetails = rentalDetailsController.getRentalDetails();
	                    System.out.println(rentDetails);
	            
			}
			System.out.println("Do you want to continue press any key except 0");
			s1 = scan.nextInt();
			}
			while(!(s1==0));
			System.out.println("Thank you");
		}
		else
		{
			System.out.println("Incorrect customer_id and password");
		}
	}

}
