package com.capgemini.retailermaintanenceapi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermaintanenceapi.dto.UserInfo;

@Repository
public class UserDaoImpl implements UserDao{

	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean registerUser(UserInfo bean) {
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
				System.out.println("user not added");
			}
			manager.close();
			
			return isAdded;
	}

//	@Override
//	public boolean updatePassword(int id, String password) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public UserInfo auth(String email, String password) {
		EntityManager manager=factory.createEntityManager();
		String jpql="from UserInfo where email=:email and password=:password";
		Query query=manager.createQuery(jpql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		
		UserInfo admin=null;
		try {
			admin=	(UserInfo) query.getSingleResult();
		}catch(Exception e) {
//			e.printStackTrace();
		}
		manager.close();
		return admin;
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		UserInfo bean=manager.find(UserInfo.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

}
