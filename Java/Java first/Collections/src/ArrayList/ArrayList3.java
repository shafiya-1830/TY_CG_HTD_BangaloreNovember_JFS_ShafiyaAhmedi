package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList3 {

	public static void main(String[] args) {
		
		
ArrayList<String> a=new ArrayList<String>();
		
		a.add("sia");
		a.add("ria");
		a.add("nia");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		
		
		
		System.out.println("------for-----");
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		
		System.out.println("------foreach-----");
		
		for (String i1 : a) {
			System.out.println(i1);
			
		}
		
		System.out.println("------Iterator-----");
		
		Iterator<String> itr=a.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("------ListIterator-----");
		ListIterator<String> itr1=a.listIterator(a.size());
		
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
	
ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("Tia");
		a1.add("Mia");
		
		System.out.println(a1);
		a1.remove(new String("Pia"));
		System.out.println(a1);
	}
}
