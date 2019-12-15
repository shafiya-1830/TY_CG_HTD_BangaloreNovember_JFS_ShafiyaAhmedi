package Vectors;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector v1=new Vector();
		v1.add(1);
		v1.add(9);
		v1.add(19);
		v1.add(29);
		System.out.println(v1);
		
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.get(i));
		}
		
		v1.set(3, 39);
		System.out.println(v1);
		v1.remove(3 );
		System.out.println(v1);
	}

}
