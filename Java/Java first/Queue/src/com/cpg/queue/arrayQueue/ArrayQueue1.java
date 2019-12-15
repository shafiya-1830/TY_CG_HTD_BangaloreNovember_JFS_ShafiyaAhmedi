package com.cpg.queue.arrayQueue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayQueue1 {

	public static void main(String[] args) {

		ArrayDeque<String> a1=new ArrayDeque<String>();
		
		a1.add("s");
		a1.add("r");
		a1.addFirst("p");
		a1.add("t");
		a1.add("q");
		
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(a1);
		a1.poll();
		System.out.println(a1.peek());
		a1.removeLast();
		System.out.println(a1);
		
		System.out.println(a1.element());
		
		
		
		
		
	}

}
