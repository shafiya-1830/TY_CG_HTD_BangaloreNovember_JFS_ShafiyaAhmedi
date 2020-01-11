package com.capgemini.retailermaintanenceapi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermaintanenceapi.dto.OrderInfo;

@Repository
public class OrderDaoImpl implements OrderDao{

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean addOrder(OrderInfo bean) {
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
			System.out.println("order not added");
		}
		manager.close();
		
		return isAdded;
	}
	
}
