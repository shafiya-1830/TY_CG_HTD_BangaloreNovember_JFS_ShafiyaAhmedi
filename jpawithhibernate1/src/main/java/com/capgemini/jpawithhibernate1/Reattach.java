package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.dto.Movie;

public class Reattach {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Movie record=entityManager.find(Movie.class, 01 );
		System.out.println(entityManager.contains(record));
		entityManager.detach(record);
		System.out.println(entityManager.contains(record));
		Movie reattachMovie=entityManager.merge(record);
		reattachMovie.setMovie_name("Thor");
		System.out.println("Record updated");
		transaction.commit();

	}

}
