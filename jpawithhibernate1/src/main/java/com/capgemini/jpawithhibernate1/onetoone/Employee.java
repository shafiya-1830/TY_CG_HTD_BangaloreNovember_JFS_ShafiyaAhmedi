package com.capgemini.jpawithhibernate1.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="emp_details")
public class Employee {

	@Id
	@Column
	private int eid;
	@Column
	private String ename;
	@Column
	private String email;
	@Column
	private String password;
	@Exclude
	@OneToOne(cascade=CascadeType.ALL,mappedBy="employee")
	private EmployeeOther other;
	
	
}
