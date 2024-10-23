package com.blog_app.service;

import java.util.List;

import com.blog_app.payload.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUser();
	UserDto getByName(String userName);
	void deleteUser(Integer userId);
	

}
