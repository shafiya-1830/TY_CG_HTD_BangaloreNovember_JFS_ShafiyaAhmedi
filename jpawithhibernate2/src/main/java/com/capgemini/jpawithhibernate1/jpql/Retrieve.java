package com.capgemini.jpawithhibernate1.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate1.dto.Movie;

public class Retrieve {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		EntityTransaction transaction=entityManager.getTransaction();
//		String jpql="from Movie";
		String jpql="select movie_name from Movie";
		Query query=entityManager.createQuery(jpql);
		List<String> list=query.getResultList();
		for(String m1:list)
		{
//			System.out.println("Id: "+m1.getMovie_id());
			System.out.println(m1);
//			System.out.println("Ratings:  "+m1.getRatings());
		}
		entityManager.close();
				}

}
