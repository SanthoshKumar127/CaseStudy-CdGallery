package com.cd.casestudy.serviceImp;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cd.casestudy.controller.AlbumController;
import com.cd.casestudy.controller.RentalDetailsController;
import com.cd.casestudy.model.Album;



@Service
public class UserImp {
	
	@Autowired
	private RentalDetailsController rentalDetailsController;
	
	@Autowired
	private AlbumController albumController;
	
	Scanner scan = new Scanner(System.in);
	int s1;
	
	public void adminOperation() {
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
					System.out.println("Enter the Album Category");
					long cid = scan.nextLong();
					album.setCategoryId(cid);
					System.out.println("Enter the Album Title");
					String aTitle = scan.next();
					album.setAlbumTitle(aTitle);
					System.out.println("Enter the Hire Price");
					double price = scan.nextDouble();
					album.setHirePrice(price);
					System.out.println("Enter No Of Cd");
					int noOfCd = scan.nextInt();
					album.setNoOfCd(noOfCd);
					String status = "Availa	ble";
					album.setStatus(status);
					albumController.createAddAlbum(album);
			break;
			
			case 2: System.out.println();
					List availableAlbum = albumController.getAllAlbum();
					//System.out.println(availableAlbum);
					availableAlbum.forEach(System.out::println);
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
	
   }



