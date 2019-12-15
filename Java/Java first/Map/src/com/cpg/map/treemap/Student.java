package com.cpg.map.treemap;

import java.util.ArrayList;
import java.util.Map;

public class Student implements Comparable<Student> {

	String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
	
	
	
}
