package com.cd.casestudy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User {

	@Id
	@Column(name="customer_id")
	private long customerId;
	@Column(name="password")
	private String password;
	@Column(name="first_name")
	private String first_name;
	@Column(name="last_name")
	private String last_name;
	@Column(name="date_of_birth")
	private String dateOfBirth;
	@Column(name="address")
	private String address;
	@Column(name="contact_number")
	private long contactNumber;
	@Column(name="credit_card_number")
	private long creditCardNumber;
	@Column(name="credit_card_type")
	private String creditCardType;
	@Column(name="credit_card_expiry")
	private String creditCardExpity;
	
	public User() {
		super();
	}
	
	

	public User(long customerId, String password) {
		super();
		this.customerId = customerId;
		this.password = password;
	}



	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

	public String getCreditCardExpity() {
		return creditCardExpity;
	}

	public void setCreditCardExpity(String creditCardExpity) {
		this.creditCardExpity = creditCardExpity;
	}



	@Override
	public String toString() {
		return "User [customerId=" + customerId + ", password=" + password + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ ", contactNumber=" + contactNumber + ", creditCardNumber=" + creditCardNumber + ", creditCardType="
				+ creditCardType + ", creditCardExpity=" + creditCardExpity + "]";
	}
	
	
}
