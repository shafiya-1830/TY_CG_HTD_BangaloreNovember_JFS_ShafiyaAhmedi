package com.capgemini.junit.five_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator {

	Calculator c=null;
	@BeforeEach
	void createObject()
	{
		c=new Calculator();
	}
	@Test
	public void testAdd()
	{
		
		int i=c.add(11, 8);
		assertEquals(19, i);
	}
	
	@Test
	void testAddForNegative()
	{
		
		int i=c.add(-2, 5);
		assertEquals(3, i);
	}
	
	@Test
	void testMul()
	{
		
		int j=c.multiply(3, 9);
		assertEquals(27, j);
	}

	@Test
	void testMulNegative()
	{
		
		int j=c.multiply(-3, 9);
		assertEquals(-27, j);
	}
	
	@Test
	void testDiv()
	{
		
		assertThrows(ArithmeticException.class,
				()-> {
					c.div(10, 0);
				});
	}
	
	@Test
	void testFindLength()
	{
		
		int r=c.findLength("sushmitha");
		assertEquals(9, r);
	}
	
	@Test
	void testLengthWithNull()
	{
		
		assertThrows(NullPointerException.class,
				()->
		{
			c.findLength(null);
		}
				);
	}
}
