package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.dto.Movie;

public class InsertDemo {

	public static void main(String[] args) {
		
		Movie movie=new Movie();
		movie.setMovie_id(02);
		movie.setMovie_name("Avengers-Infinitywar");
		movie.setRatings("Excellent"); 
//		Movie movie=new Movie();
//		product.setPid(01);
//		product.setPname("Watch");
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(movie);
		System.out.println("Record saved");
		transaction.commit();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		}
		
		entityManager.close();
		
	}

}
