package com.jsp.access.pack2;

import com.jsp.access.pack1.Student;

public class TestStudent extends Student{
protected TestStudent(int a) {
		super(a);
		
	}
void studentDetials()
{
	System.out.println("value of a= "+a);
}

public static void main(String[] args) {
	TestStudent s=new TestStudent(20);
	s.studDetails();
	s.studentDetials();
}



}
