package com.mkyong;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest{
	
	Calculator calc;
	
	@Before
	public void setUp(){
		calc=new Calculator();
	}
	
	@Test
	public void testAdd(){
		
		assertEquals(3, calc.add(1,2));
	}
	
	@Test
	public void testSubtract(){
		assertEquals(5, calc.subtract(8,3));
	}
	
	@Test
	public void testMultiply(){
		assertEquals(15, calc.multiply(3,5));
	}
	
	@Test
	public void testDivide(){
		assertEquals(3, calc.divide(12,4));
	}
	
	
}