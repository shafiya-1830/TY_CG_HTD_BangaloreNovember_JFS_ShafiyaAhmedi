package com.capgemini.jpawithhibernate1.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="emp_otherinfo")
public class EmployeeOther {

	@Id
	@Column
	private int id;
	@Column
	private String pan_id;
	@Column
	private String father_name;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private Employee employee;
	
}
