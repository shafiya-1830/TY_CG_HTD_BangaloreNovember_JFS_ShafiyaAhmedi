package com.jsp.access.pack2;

import com.jsp.access.pack1.Person;

public class TestPerson {
public static void main(String[] args) {
	Person p=new Person();
	p.details(10);
	p.personDetails(20);
	System.out.println(p.age);
	System.out.println(p.ages);
}
}
