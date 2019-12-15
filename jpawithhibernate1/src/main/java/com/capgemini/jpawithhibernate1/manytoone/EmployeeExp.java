package com.capgemini.jpawithhibernate1.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate1.onetoone.Employee;

import lombok.Data;

@Data
@Entity
@Table(name="emp_exp")
public class EmployeeExp {

	@Id
	@Column
	private int expid;
	@Column
	private String company;
	@Column
	private int noOfYear;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private Employee employee;
	
	
}
