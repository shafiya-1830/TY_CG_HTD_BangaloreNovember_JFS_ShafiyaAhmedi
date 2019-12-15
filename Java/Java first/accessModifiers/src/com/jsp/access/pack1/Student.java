package com.jsp.access.pack1;

public class Student {

	protected int a;
	protected Student(int a)
	{
		this.a=a;
	}
	
	protected void studDetails()
	{
		System.out.println("a = "+a);
	}
}
