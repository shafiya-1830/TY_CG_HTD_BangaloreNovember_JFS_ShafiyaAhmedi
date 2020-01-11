package com.capgemini.retailermaintanenceapi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermaintanenceapi.dto.ProductInfo;

@Repository
public class ProductDaoImpl implements ProductDao{

	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean addProduct(ProductInfo bean) {
		boolean isAdded=false;
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction;
		try {
			transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			isAdded=true;
		}catch(Exception e) {
			System.out.println("product not added");
		}
		manager.close();
		
		return isAdded;
	}

	@Override
	public ProductInfo getProduct(int productId) {
		EntityManager manager = factory.createEntityManager();
		ProductInfo product=manager.find(ProductInfo.class, productId);
		return product;
	}

	
}
