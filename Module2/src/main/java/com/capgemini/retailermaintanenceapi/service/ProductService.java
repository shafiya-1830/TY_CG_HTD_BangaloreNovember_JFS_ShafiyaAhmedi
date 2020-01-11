package com.capgemini.retailermaintanenceapi.service;

import com.capgemini.retailermaintanenceapi.dto.ProductInfo;
import com.capgemini.retailermaintanenceapi.dto.UserInfo;

public interface ProductService {

	public boolean addProduct(ProductInfo bean);
	public ProductInfo getProduct(int productId);
}
