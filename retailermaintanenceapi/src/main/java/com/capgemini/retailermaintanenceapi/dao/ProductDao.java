package com.capgemini.retailermaintanenceapi.dao;

import com.capgemini.retailermaintanenceapi.dto.OrderInfo;
import com.capgemini.retailermaintanenceapi.dto.ProductInfo;


public interface ProductDao {

	public boolean addProduct(ProductInfo bean);
	public ProductInfo getProduct(int productId); 
	
}
