package com.jsp.queue.priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueue2 {

	public static void main(String[] args) {

		PriorityQueue<Student> p=new PriorityQueue<Student>();
		
		p.add(new Student(22,"rachel"));
		p.add(new Student(23,"ross"));
		p.add(new Student(24,"chandler"));
		p.add(new Student(22,"rachel"));
		
		for(Student s:p)
		{
			System.out.println(s);
		}
	}

}
