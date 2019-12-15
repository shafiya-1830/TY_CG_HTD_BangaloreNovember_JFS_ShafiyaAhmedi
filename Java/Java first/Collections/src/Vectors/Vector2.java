package Vectors;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		
		Vector v1=new Vector();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.add(1);
		v1.add(9);
		v1.add(11);
		v1.add(19);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.trimToSize();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.setSize(10);
		System.out.println(v1.size());
		System.out.println(v1);
		
		v1.set(5, 21);
		System.out.println(v1);
		System.out.println(v1.capacity());
		 
		

	}

}
