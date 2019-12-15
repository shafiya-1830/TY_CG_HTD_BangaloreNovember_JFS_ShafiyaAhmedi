package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList l3=new ArrayList();
		l3.add("S");
		l3.add("H");
		
		ArrayList l4=new ArrayList();
		l4.add("A");
		l4.add("F");
		l4.add(" ");
		
		l3.addAll(1, l4);
		System.out.println(l3);
		
		
		l3.set(1, "I");
		System.out.println(l3);
		
		
		System.out.println(l3.subList(0, 3));
		
		System.out.println(l3);
		l3.add("I");
		System.out.println(l3);
		System.out.println(l3.lastIndexOf("I"));
		System.out.println(l3.indexOf("I"));
		
		System.out.println(l3.get(2));

	}

}
