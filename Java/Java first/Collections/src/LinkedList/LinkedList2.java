package LinkedList;

import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
		l1.add(12);
		l1.add(13);
		l1.add(14);
		
		System.out.println("---addFirst---");
		l1.addFirst(11);
		System.out.println(l1);
		
		System.out.println("---addLast---");
		l1.addLast(15);
		System.out.println(l1);
		
		System.out.println("---removeFirst---");
		l1.removeFirst();
		System.out.println(l1);
		
		System.out.println("---removeLast---");
		l1.removeLast();
		System.out.println(l1);
		
		l1.add(13);
		l1.add(15);
		l1.add(13);
		System.out.println(l1);
		
		System.out.println("---removeFirstOccurence---");
		l1.removeFirstOccurrence(13);
		System.out.println(l1);
		
		System.out.println("---removeLastOccurence---");
		l1.removeLastOccurrence(13);
		System.out.println(l1);
		
		System.out.println("---getFirst---");
		System.out.println(l1.getFirst());
		
		System.out.println("---getLast---");
		System.out.println(l1.getLast());
		
		
		
	}

}
