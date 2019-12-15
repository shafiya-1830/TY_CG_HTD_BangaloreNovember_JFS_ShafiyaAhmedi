package com.jsphebbal.typecasting.pack1;

public class TestAnimal {
public static void main(String[] args) {
	Animal a1=new Animal();
	a1.eat();
	
	Animal a2=new Dog();//upcasting
	a2.eat();
	
	Dog d=(Dog) a2;//downcasting
	d.eat();
	d.walk();
	
	Animal a3=new Lion();//upcasting
	a3.eat();
	
	Lion l=(Lion) a3;//downcasting
	l.eat();
	l.run();
}
	
	
	
}
