package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.dto.Movie;

public class ReadDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Movie record=entityManager.find(Movie.class, 01);
		System.out.println("Id- "+record.getMovie_id());
		System.out.println("Movie name- "+record.getMovie_name());
		System.out.println("ratings- "+record.getRatings());
		entityManager.close();
		

	}

}
