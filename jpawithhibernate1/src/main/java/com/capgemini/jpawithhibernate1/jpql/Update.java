package com.capgemini.jpawithhibernate1.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
//		String jpql="update Movie set movie_name='Sherlock' where movie_id=2";
		String jpql="update Movie set movie_name=:mname where movie_id=:id";
		Query query=entityManager.createQuery(jpql);
		query.setParameter("mname", "KHNH");
		query.setParameter("id",3);
		int count=query.executeUpdate();
		System.out.println(count);
//		if(count>0){
//			System.out.println("query updated");
//		}
//		else{
//			System.out.println("something went wrong");
//		}
		transaction.commit();
	}

}
