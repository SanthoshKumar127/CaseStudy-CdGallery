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

@Service
public class CustomerImp{

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AlbumController albumController;
	
	@Autowired
	private AlbumRepository albumRepository;
	
	@Autowired
	private UserController userController;
	
	@Autowired
	private RentalDetailsController rentalDetailsControllerl;
	
	
	public void customerOperation() throws ResourceNotFound{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Choice");
		System.out.println("1. New User");
		System.out.println("2. Existing User");
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1: User user = new User();
				int rolId = 2;
				user.setRoleId(rolId);
				String roleName = "Customer";
				user.setRoleName(roleName);
				System.out.println("Enter the email");
				String email = scan.next();
				user.setEmail(email);
				System.out.println("Enter the password");
				String password = scan.next();
				user.setPassword(password);
				System.out.println("Enter the First Name");
				String firstName = scan.next();
				user.setFirst_Name(firstName);
				System.out.println("Enter the Last Name");
				String lastName = scan.next();
				user.setLastName(lastName);
				System.out.println("Enter the Address");
				String address = scan.next();
				user.setAddress(address);
				userController.newUser(user);
				System.out.println("User Successfully Registered");
				
		break;
		case 2: Album album = new Album();
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
				albumController.updateCd(albumId, album);
				Optional<Album> rentalAlbum = albumRepository.findById(albumId);
				if(!rentalAlbum.isPresent())
				{
					throw new ResourceNotFound("Album is not available in this albumId ::" + albumId);
				}
				else
				{
					System.out.println(rentalAlbum);
					rent.setAlbum(rentalAlbum.get());
				}
				
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
				Album price = rentalAlbum.get();
				rent.settotalPrice(price.getHirePrice()*noOfDays);
				rentalDetailsControllerl.rentAlbum(rent);
				System.out.println("Successfully rented the CD");
				System.out.println("Thank You Visit Again");
		}
	}

}
