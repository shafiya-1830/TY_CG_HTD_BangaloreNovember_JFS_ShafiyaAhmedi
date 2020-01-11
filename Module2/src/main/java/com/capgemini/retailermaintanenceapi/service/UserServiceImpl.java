package com.capgemini.retailermaintanenceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintanenceapi.dao.UserDao;
import com.capgemini.retailermaintanenceapi.dto.ProductInfo;
import com.capgemini.retailermaintanenceapi.dto.UserInfo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;

	@Override
	public boolean registerUser(UserInfo bean) {
//		List<ProductInfo> productBeans=bean.getAddProduct();
//		for(ProductInfo add:productBeans) {
//			add.setUserInfo(bean);
//			
//		}
		return dao.registerUser(bean);
	}

	@Override
	public UserInfo auth(String email, String password) {
		
		return dao.auth(email, password);
	}

	@Override
	public boolean changePassword(int id, String password) {
	
		return dao.changePassword(id, password);
	}
	
	
	
}
