package com.capgemini.retailermaintanenceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintanenceapi.dao.OrderDao;
import com.capgemini.retailermaintanenceapi.dto.OrderInfo;
import com.capgemini.retailermaintanenceapi.dto.ProductInfo;
import com.capgemini.retailermaintanenceapi.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao dao;
	
	@Override
	public boolean addOrder(OrderInfo bean) {
		
		return dao.addOrder(bean);
		
	}

	
	
}
