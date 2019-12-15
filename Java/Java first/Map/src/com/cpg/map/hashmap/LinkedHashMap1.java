package com.cpg.map.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> l1=new LinkedHashMap<String, Integer>();
		
		l1.put("BTM", 560072);
		l1.put("BTR", 670098);
		l1.put("Hebbal", 561203);
		l1.put(null, 561203);
		l1.put(null, null);
		
		Set<Map.Entry<String,Integer>> s1=l1.entrySet();
		
		for(Map.Entry<String,Integer> m1:s1)
		{
			System.out.println(m1.getValue());
			System.out.println(m1.getKey());
			
			System.out.println("---------------");
		}
		
		System.out.println(s1.isEmpty());
		System.out.println(l1.containsKey("BTM"));
		System.out.println(l1.containsValue(561203));
	}

}
