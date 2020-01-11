package com.capgemini.retailermaintanenceapi.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermaintanenceapi.dto.ProductInfo;
import com.capgemini.retailermaintanenceapi.dto.ProductResponse;
import com.capgemini.retailermaintanenceapi.dto.UserInfo;
import com.capgemini.retailermaintanenceapi.dto.UserResponse;
import com.capgemini.retailermaintanenceapi.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@PostMapping(path="/add-product",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody ProductInfo product) {
		ProductResponse response = new ProductResponse();
		if(service.addProduct(product)){
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product with same name already exists");
		}
		return response;
}
	@GetMapping(path="/view-product",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse viewProduct(@RequestParam("id") int id) {
		ProductResponse response = new ProductResponse();
		ProductInfo product=service.getProduct(id);
		if(product!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product found");
			response.setBean(Arrays.asList(product));;
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product id does not exist");
		}
		return response;
	}
}
