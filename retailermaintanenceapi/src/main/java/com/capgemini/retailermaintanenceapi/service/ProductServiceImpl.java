package com.capgemini.retailermaintanenceapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintanenceapi.dao.ProductDao;
import com.capgemini.retailermaintanenceapi.dto.ProductInfo;


@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao dao;

	@Override
	public boolean addProduct(ProductInfo bean) {
		
		return dao.addProduct(bean);
	}

	@Override
	public ProductInfo getProduct(int productId) {
		
		return dao.getProduct(productId);
	}

	
}
