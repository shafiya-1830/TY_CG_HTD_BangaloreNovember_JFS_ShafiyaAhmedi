package com.capgemini.retailermaintanenceapi.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermaintanenceapi.dto.UserInfo;
import com.capgemini.retailermaintanenceapi.dto.UserResponse;
import com.capgemini.retailermaintanenceapi.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping(path="/add-user",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse addCustomer(@RequestBody UserInfo user) {
		UserResponse response = new UserResponse();
		if(service.registerUser(user)){
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User with same name already exists");
		}
		return response;
	}
	
	@PostMapping(path="/auth", produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse auth(@RequestBody UserInfo bean) { 
		UserInfo user=service.auth(bean.getEmail(),bean.getPassword());
		UserResponse response=new UserResponse();
		if(user!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("User found for the credentials");
			response.setBean(Arrays.asList(user));
			
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Credentials invalid");
		}
		return response;
	}
	
	@PutMapping(path="/change-password", produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse changePassword(@RequestBody UserInfo bean) {
		UserResponse response=new UserResponse();
		
		if(service.changePassword(bean.getId(), bean.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("password changed");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("password not changed");
		}
		return response;
	}
}
