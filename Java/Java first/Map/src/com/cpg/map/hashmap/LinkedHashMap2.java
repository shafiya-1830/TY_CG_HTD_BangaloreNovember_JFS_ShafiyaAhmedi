package com.cpg.map.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap2 {

	public static void main(String[] args) {

		LinkedHashMap<Integer, Employee> l1=new LinkedHashMap<Integer,Employee>();
		
		l1.put(1, new Employee(25000,"Sia"));
		l1.put(3, new Employee(25000,"Ria"));
		l1.put(5, new Employee(25000,"Tia"));
		
		System.out.println(l1.get(3));
		
		Set<Map.Entry<Integer,Employee>> s1=l1.entrySet();
		
		for(Map.Entry<Integer,Employee> m1:s1)
		{
			System.out.println(m1.getKey());
			System.out.println(m1.getValue());
			System.out.println("--------------");
		}
		
		System.out.println(l1.containsKey(3));
		System.out.println(l1.containsValue(new Employee(25000,"Ria")));
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
	}

}
