package com.cpg.map.hashmap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		
		SortedAge s=new SortedAge();
		SortedName s2=new SortedName();
		TreeMap<Student1,String> t1=new TreeMap<Student1,String>(s2);
		 
		t1.put(new Student1(12,"A"), "A");
		t1.put(new Student1(10,"S"), "S");
		t1.put(new Student1(11,"H"), "H");
		
		
		Set<Map.Entry<Student1,String>> s1=t1.entrySet();
		
		for(Map.Entry<Student1,String> e1:s1)
		{
			System.out.println(e1.getValue());
			System.out.println(e1.getKey());
			System.out.println("------------------");
		}
		

	}

}
