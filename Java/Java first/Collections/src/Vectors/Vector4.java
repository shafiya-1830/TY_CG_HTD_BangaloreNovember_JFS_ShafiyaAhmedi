package Vectors;

import java.util.Vector;

public class Vector4 {

	public static void main(String[] args) {
		
		Vector v1=new Vector();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		System.out.println(v1);
		
		v1.removeElement(new Integer(3));
		System.out.println(v1);
		
		v1.removeAllElements();
		System.out.println(v1);
		
		Vector v2=new Vector();
		v2.add(1);
		v2.add(2);
		v2.add(3);
		
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		
		v2.trimToSize();
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		
		v2.ensureCapacity(7);
		v2.setSize(9);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		
		System.out.println(v2);

	}

}
