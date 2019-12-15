package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.dto.Movie;
import com.capgemini.jpawithhibernate1.dto.Product;

public class GetReference {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		Movie record=entityManager.getReference (Movie.class, 03);
		System.out.println(record.getClass());
//		System.out.println("Id "+record.getMovie_id());
//		System.out.println("name "+record.getMovie_name());
//		System.out.println("ratings "+record.getRatings());
		entityManager.close();
	}

}
