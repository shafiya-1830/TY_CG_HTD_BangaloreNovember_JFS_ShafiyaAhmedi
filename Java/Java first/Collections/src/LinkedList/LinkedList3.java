package LinkedList;

import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
		l1.add(22);
		l1.add(23);
		l1.add(24);
		l1.add(25);
		System.out.println(l1);
		
		System.out.println("---Peek, peekFirst,peekLast---");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		
		System.out.println("---poll,pollFirst,pollLast---");
		System.out.println(l1.poll());
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		
		
		LinkedList l2=new LinkedList();
		l2.add(1);
		l2.add(19);
		l2.add(29);
		l2.add(39);
		
		System.out.println("---offer,offerFirst,offerLast---");
		System.out.println(l2);
		l2.offer(59);
		System.out.println(l2);
		l2.offerFirst(9);
		System.out.println(l2);
		l2.offerLast(69);
		System.out.println(l2);
		
	
		
	}
}
