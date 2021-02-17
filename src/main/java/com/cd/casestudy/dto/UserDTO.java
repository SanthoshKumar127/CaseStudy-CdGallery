package com.cd.casestudy.dto;


public class UserDTO {
	
	
	private long userId;
	private int roleId;
	private String roleName;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String address;
	
	
	public UserDTO() {
		super();
	}


	public long getUserId() {
		return userId;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}


	public int getRoleId() {
		return roleId;
	}


	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", roleId=" + roleId + ", roleName=" + roleName + ", email=" + email
				+ ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + "]";
	}
	
	
}
