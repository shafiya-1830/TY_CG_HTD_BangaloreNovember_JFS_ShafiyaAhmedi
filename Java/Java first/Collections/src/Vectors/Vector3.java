package Vectors;

import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) {
		
		Vector v1=new Vector();
		
		v1.addElement(12);
		v1.addElement(13);
		v1.addElement(14);
		v1.add(15);
		System.out.println(v1);
		
		v1.removeElement(new Integer(12));
		System.out.println(v1);
		
		v1.removeElementAt(0);
		System.out.println(v1);
		
		Object o1[]=new Object[v1.size()];
		v1.copyInto(o1);
		
		for(int i=0;i<o1.length;i++)
		{
			System.out.println(o1[i]);
		}
		
		

	}

}
