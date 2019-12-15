package com.capgemini.jpawithhibernate1.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.onetoone.Employee;

public class TestManyToOne {

	public static void main(String[] args) {

		Employee emp=new Employee();
		emp.setEid(5);
		emp.setEname("Nia");
		emp.setEmail("nia@gmail.com");
		emp.setPassword("nia123");
		
		EmployeeExp exp=new EmployeeExp();
		exp.setExpid(111);
		exp.setCompany("Cognizant");
		exp.setNoOfYear(2);
		exp.setEmployee(emp);
		
		EmployeeExp exp1=new EmployeeExp();
		exp1.setExpid(112);
		exp1.setCompany("IBM");
		exp1.setNoOfYear(1);
		exp1.setEmployee(emp);
		
		EntityManagerFactory entityManagerfactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(exp);
		entityManager.persist(exp1);
		
		System.out.println("Record saved");
		transaction.commit();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		}
		
		entityManager.close();
	}

}
