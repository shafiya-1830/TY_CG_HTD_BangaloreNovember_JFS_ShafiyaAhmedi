package com.jsp.queue.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	public static void main(String[] args) {

		Queue p=new PriorityQueue();
		
		p.offer(1);
		p.offer(13);
		p.offer(19);
		p.offer(49);
		p.offer(79);
		 
		System.out.println(p);
		p.poll();
		p.poll();
		p.remove();
		System.out.println(p.element());
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p);
		
		for(Object o1:p)
		{
			System.out.println(o1);
		}
	}

}
