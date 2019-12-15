package com.cpg.map.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3 {

	public static void main(String[] args) {

		ArrayList<Student> a1=new ArrayList<Student>();
		
		a1.add(new Student("Sia"));
		a1.add(new Student("Ria"));
		
		ArrayList<Student> a2=new ArrayList<Student>();
		
		a2.add(new Student("Tia"));
		a2.add(new Student("Nia"));
		
		ArrayList<Student> a3=new ArrayList<Student>();
		
		a3.add(new Student("Mia"));
		a3.add(new Student("Pia"));
		
		TreeMap<String,ArrayList> t1=new TreeMap<String,ArrayList>();
		
		t1.put("2nd standard", a2);
		t1.put("1st standard", a1);
		t1.put("3rd standard", a3);
		
		Set<Map.Entry<String,ArrayList>> s1=t1.entrySet();
		
		System.out.println(t1.get("1st standard"));
		
		for(Map.Entry<String,ArrayList> e1:s1)
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-----------------");
		}
		
		
	}

}
