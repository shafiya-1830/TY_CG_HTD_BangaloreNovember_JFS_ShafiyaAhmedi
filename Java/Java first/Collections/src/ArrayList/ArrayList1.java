package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("Sia");
		a1.add("Ria");
		a1.add("Nia");
		
		ArrayList<String> a2=new ArrayList<String>();
		
		a2.add("Tia");
		a2.add("Mia");
		a2.add("Pia");
		
		System.out.println(a1);
		a1.addAll(a2);
		
		System.out.println(a1);
		
		a1.remove(1);
		System.out.println(a1);
		
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		
		System.out.println(a1.contains("ria"));
		
		a2.retainAll(a1);
		System.out.println(a2);
		
		System.out.println(a2.containsAll(a1));
		

	}

}
