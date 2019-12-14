package com.capgemini.jpawithhibernate1.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToOne {

	public static void main(String[] args) {

//		Employee emp=new Employee();
//		emp.setEid(4);
//		emp.setEname("Tia");
//		emp.setEmail("tia@gmail.com");
//		emp.setPassword("tia@123");
//		EmployeeOther other=new EmployeeOther();	
//		other.setId(12);
//		other.setPan_id("CX012");
//		other.setFather_name("daniel");
//		other.setEmployee(emp);
//		
		EntityManagerFactory entityManagerfactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		Employee emp=entityManager.find(Employee.class, 3);
		System.out.println(emp.getOther().getPan_id());
		System.out.println("Record saved");
		transaction.commit();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		}
		
		entityManager.close();
		
		
	}

}
