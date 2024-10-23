package com.blog_app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog_app.payload.ApiResponse;
import com.blog_app.payload.UserDto;
import com.blog_app.service.UserService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/users")
@Valid
public class Controller {
	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public ResponseEntity<UserDto> createdUser(@Valid @RequestBody UserDto userDto)
	{
		UserDto createUserDto=this.userService.createUser(userDto);
		return new 	ResponseEntity<>(createUserDto, HttpStatus.CREATED);
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto, @PathVariable("userId") Integer uid )  {
		UserDto updatedUser=this.userService.updateUser(userDto, uid);

		return ResponseEntity.ok(updatedUser);
	}
	
//	@DeleteMapping("/{userId}")
//	public ResponseEntity<UserDto>  deleteUser(@PathVariable("userId") Integer uid)
//	{
//		this.userService.deleteUser(uid);
//	    return new ResponseEntity(Map.of("message", "user deleted"),HttpStatus.OK);
//	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse>  deleteUser(@PathVariable("userId") Integer uid)
	{
		this.userService.deleteUser(uid);
	    return new ResponseEntity(new ApiResponse("User deleted successfully", true),HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List <UserDto>> getAllUsers()
	{
		return ResponseEntity.ok(this.userService.getAllUser());
	}
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getUserById(@PathVariable("userId") Integer uid) {
		return new ResponseEntity(this.userService.getUserById(uid), HttpStatus.OK);
	}
	
	@GetMapping("/one/{userName}")
	public ResponseEntity<UserDto> getUserByName(@PathVariable("userName") String uname)
	{
		return new ResponseEntity(this.userService.getByName(uname), HttpStatus.OK);
	}
	
}
