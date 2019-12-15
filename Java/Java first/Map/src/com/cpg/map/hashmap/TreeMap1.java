package com.cpg.map.hashmap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {

		TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
		
		t1.put(1,"S");
		t1.put(3,"H");
		t1.put(5,"A");
		
		Set<Map.Entry<Integer,String>> s1=t1.entrySet();
		
		for(Map.Entry<Integer, String> e1:s1)
		{
			System.out.println(e1.getValue());
			System.out.println(e1.getKey());
		}
	}

}
