package com.capgemini.retailermaintanenceapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermaintanenceapi.dto.OrderInfo;
import com.capgemini.retailermaintanenceapi.dto.OrderResponse;
import com.capgemini.retailermaintanenceapi.dto.UserInfo;
import com.capgemini.retailermaintanenceapi.dto.UserResponse;
import com.capgemini.retailermaintanenceapi.service.OrderService;
import com.capgemini.retailermaintanenceapi.service.UserService;

@RestController
public class OrderController {

	@Autowired
	OrderService service;
	
	@PostMapping(path="/add-order",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse addOrder(@RequestBody OrderInfo order) {
		OrderResponse response = new OrderResponse();
		if(service.addOrder(order)){
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Order already exists");
		}
		return response;
	}
}
