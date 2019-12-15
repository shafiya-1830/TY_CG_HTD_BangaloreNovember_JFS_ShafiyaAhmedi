package com.jsphebbal.typecasting.pack1;

public class Primitive {
	
	//Implicit tyepCasting
byte b=4;

short c=b;
int d=b;

float e=b;
double f=b;

void values()
{
	System.out.println("byte value is "+b);
	System.out.println("short value is "+c);
	System.out.println("int value is "+d);
	System.out.println("float value is "+e);
	System.out.println("double value is "+f);
	
}

//Explicit typeCasting

double pi=3.14;

int i=(int) pi;

void details()
{
	System.out.println("double value is "+pi);
	System.out.println("int value is "+i);
	
	
}
}
