package com.cpg.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {

		HashMap h1=new HashMap();
		
		h1.put(1, "S");
		h1.put(3, "H");
		h1.put(5, "A");
		h1.put(5, "R");
		
		Set<Map.Entry<Integer, String>> s1=h1.entrySet();
		
		for(Map.Entry<Integer, String> e1 :s1)
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-----------------");
		}
		
	}

}
