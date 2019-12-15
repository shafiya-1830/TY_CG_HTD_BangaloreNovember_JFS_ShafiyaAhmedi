package com.capgemini.jpawithhibernate1.manytomany;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.capgemini.jpawithhibernate1.onetoone.Employee;
import lombok.Data;

@Data
@Entity
@Table(name="train_info")
public class TrainingInfo {

	@Id 
	@Column
	private int tid;
	@Column
	private String tname;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="emp_train",joinColumns=@JoinColumn(name="tid"),inverseJoinColumns=@JoinColumn(name="eid"))
	private List<Employee> employee;
}
