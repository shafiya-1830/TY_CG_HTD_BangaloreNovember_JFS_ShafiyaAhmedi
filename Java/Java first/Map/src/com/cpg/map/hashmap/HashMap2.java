package com.cpg.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {

		HashMap<Integer, Student> h1=new HashMap<Integer, Student>();
		
		h1.put(1, new Student(22,"Sia"));
		h1.put(3, new Student(23,"Ria"));
		h1.put(5, new Student(24,"Tia"));
		h1.put(null,null);
		
		Collection<Student> c1=h1.values();
		
		Set<Integer> i1=h1.keySet();
		for(Integer s2:i1)
		{
			System.out.println(s2);
		}
		
		for(Student s1:c1)
		{
			System.out.println(s1);
		}
		
		System.out.println(h1.containsKey(3));
		System.out.println(h1.containsValue(new Student(22,"Sia")));
	}

}
