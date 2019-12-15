package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.dto.Movie;



public class UpdateDemo {

	public static void main(String[] args) {

		EntityTransaction transaction=null;
		EntityManager entityManager=null;
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		 transaction=entityManager.getTransaction();
		transaction.begin();
		Movie record=entityManager.find(Movie.class, 02);
		
		record.setMovie_name("Avengers-Age of ultron");
		
		System.out.println("id: "+record.getMovie_name());
		System.out.println("Record updated");
		transaction.commit();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		transaction.rollback();
	}
	entityManager.close();
	
	}

}
