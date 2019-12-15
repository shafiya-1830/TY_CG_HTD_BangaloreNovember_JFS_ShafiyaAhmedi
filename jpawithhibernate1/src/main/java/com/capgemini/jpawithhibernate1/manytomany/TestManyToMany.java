package com.capgemini.jpawithhibernate1.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.onetoone.Employee;

public class TestManyToMany {

	public static void main(String[] args) {

		Employee emp=new Employee();
		emp.setEid(6);
		emp.setEname("Dia");
		emp.setEmail("dia@gmail.com");
		emp.setPassword("dia123");
		
		Employee emp1=new Employee();
		emp1.setEid(7);
		emp1.setEname("Pia");
		emp1.setEmail("pia@gmail.com");
		emp1.setPassword("pia123");
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(emp);
		list.add(emp1);
		
		TrainingInfo t1=new TrainingInfo();
		t1.setTid(101);
		t1.setTname("JavaFullStack");
		t1.setEmployee(list);
		
		EntityManagerFactory entityManagerfactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(t1 );
		
		
		System.out.println("Record saved");
		transaction.commit();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		}
		
		entityManager.close();
	}

}
