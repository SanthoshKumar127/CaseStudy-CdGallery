package com.cd.casestudy.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cd.casestudy.dto.UserDTO;
import com.cd.casestudy.model.User;

@Component
public class UserConverter {

	public UserDTO entityToDto(User user)
	{
		UserDTO dto = new UserDTO();
		
		dto.setUserId(user.getUserId());
		dto.setRoleId(user.getRoleId());
		dto.setRoleName(user.getRoleName());
		dto.setEmail(user.getEmail());
		dto.setPassword(user.getPassword());
		dto.setFirstName(user.getFirst_Name());
		dto.setLastName(user.getLastName());
		dto.setAddress(user.getAddress());
		
		return dto;
	}
	
	public User dtoToEntity(UserDTO dto)
	{
		User user = new User();
		
		user.setUserId(dto.getUserId());
		user.setRoleId(dto.getRoleId());
		user.setRoleName(dto.getRoleName());
		user.setEmail(dto.getEmail());
		user.setPassword(dto.getPassword());
		user.setFirst_Name(dto.getFirstName());
		user.setLastName(dto.getLastName());
		user.setAddress(dto.getAddress());
		
		return user;
	}
	
	public List<UserDTO> entityToDto(List<User> user)
	{
		return user.stream().map(us->entityToDto(us)).collect(Collectors.toList());
	}
}
