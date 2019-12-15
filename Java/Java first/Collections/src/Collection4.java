import java.util.ArrayList;
import java.util.Collection;

public class Collection4 {

	public static void main(String[] args) {
Collection c1=new ArrayList();
		
		c1.add(25);
		c1.add(23);
		c1.add(86);
		Collection c2=new ArrayList();
		c2.add(86);
		c2.add(98);
		c1.addAll(c2);
		System.out.println(c1);
		
		//removeAll -> removes duplicates i,e objects present in c1 that matches to c2
		c1.removeAll(c2);
		System.out.println(c1);
		
		System.out.println("**************************************");
		Collection c3=new ArrayList();
		
		c3.add(25);
		c3.add(23);
		c3.add(86);
		c3.add(98);
		
		System.out.println(c3);
Collection c4=new ArrayList();
		
		c4.add(25);
		c4.add(23);
		c4.add(12);
		c4.add(13);
		
		System.out.println(c4);
		
		//retainAll -> it'll return the matching records/elements
		c4.retainAll(c3);
		System.out.println(c4);
		
		//containsAll -> tries to match collections, if same returns true else returns false
		
		System.out.println(c4.containsAll(c3));
		
		c4.clear();//removes all elements
		System.out.println(c4);
		
		

	}

}
