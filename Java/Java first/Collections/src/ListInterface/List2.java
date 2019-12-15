package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {

		List l3=new ArrayList();
		l3.add(45);
		l3.add(46);
		
		List l4=new ArrayList();
		l4.add(12);
		l4.add(13);
		
		l3.addAll(1, l4);
		System.out.println(l3);
		
		
		l3.set(1, 19);
		System.out.println(l3);
		
		
		System.out.println(l3.subList(0, 3));
	}

}
