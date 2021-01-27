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
	
	@Override
	public void userValidate(String email, String password) {
		
		Scanner scan = new Scanner(System.in);
		int s1;
		//customerImp.CustomerValidation(email, password);
		List userOpt = userRepository.loginCredentials(email, password);
		System.out.println(userOpt);
		User user = userRepository.findByEmail(email);
		if(user.getRoleId()==1)
		{
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
			else
			{
				System.out.println("Incorrect customer_id and password");
			}
		}
		else
		{

			Album album = new Album();
			System.out.println("Login Successful");
			List a = albumController.getAllAlbum();
			a.forEach(System.out::println);
			System.out.println("Enter the album Id u need to buy");
			long aId = scan.nextLong();
			ResponseEntity<Optional<Album>> al = albumController.getAlbumByAlbumId(aId);
			System.out.println(al);
			System.out.println("Enter the details to rent the CD");
			RentalAlbumDetails rent = new RentalAlbumDetails();
			System.out.println("Enter the albumId");
			long albumId = scan.nextLong();
			Optional<Album> rentalAlbum = albumRepository.findById(albumId);
			//rentalAlbum.get();
			System.out.println(rentalAlbum);
			rent.setAlbum(rentalAlbum.get());
			//System.out.println(renatlAlbum);
			//rent.setUser((User) cusOpt.get(1));
			System.out.println("Enter the email");
			String email1 = scan.next();
			User user1 = userRepository.findByEmail(email1);
			System.out.println(user1);
			rent.setUser(user1);	
			System.out.println("Enter the hire date");
			String hireDate = scan.next();
			rent.setHireDate(hireDate);
			System.out.println("Enter the No Of days CD required");
			int noOfDays = scan.nextInt();
			rent.setNoOfDays(noOfDays);
			String status = "Hired";
			rent.setStatus(status);
		    //Optional<Album> albumDetails = albumController.getAblumById(albumId);
			//List list = (List) albumDetails.get();
			System.out.println("Enter the hire price");
			double hirePrice = scan.nextDouble();
			rent.settotalPrice(hirePrice*noOfDays);
			rentalDetailsController.rentAlbum(rent);
			System.out.println("Successfully rented the CD");
			System.out.println("Thamk You Visit Again");
		
		}
	}
	
}
