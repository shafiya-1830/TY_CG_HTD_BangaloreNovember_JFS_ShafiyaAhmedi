package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(12);
		a.add(13);
		a.add(14);
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		
		
		
		System.out.println("------for-----");
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		
		System.out.println("------foreach-----");
		
		for (Integer i1 : a) {
			System.out.println(i1);
			
		}
		
		System.out.println("------Iterator-----");
		
		Iterator<Integer> itr=a.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("------ListIterator-----");
		ListIterator<Integer> itr1=a.listIterator(a.size());
		
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
	
ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(12);
		a1.add(13);
		
		System.out.println(a1);
		a1.remove(new Integer(12));
		System.out.println(a1);
		
		
	}
	
}
