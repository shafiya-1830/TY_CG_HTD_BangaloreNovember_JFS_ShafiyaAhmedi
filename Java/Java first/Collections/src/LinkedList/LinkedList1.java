package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
		l1.add(12);
		l1.add(13);
		l1.add(14);
		System.out.println(l1);
		System.out.println("-----ListIterator------");
		ListIterator ltr=l1.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		l1.add(13);
		System.out.println(l1);
		l1.remove(new Integer(13));
		System.out.println(l1);
		l1.add(null);
		l1.add("abc");
		l1.add(16);
		System.out.println(l1);
		System.out.println("-----Foreach loop------");
		for (Object i1 : l1) {
			System.out.println(i1);
		}
		System.out.println("-----For loop------");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}

	}

}
