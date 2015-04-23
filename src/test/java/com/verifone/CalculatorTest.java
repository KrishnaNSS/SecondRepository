package com.verifone;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	
	Calculator calc;
	
	@Before
	public void setUp()
	{
		calc = new Calculator();
	}
	
	@Test
	public void testAdd()
	{
		assertEquals(13, calc.add(9, 4));
	}
	
	@Test
	public void testSubtract()
	{
		assertEquals(5, calc.subtract(9, 4));
	}
	
	@Test
	public void testMultiply()
	{
		assertEquals(36, calc.multiply(9, 4));
	}
	
	@Test
	public void tesDevide()
	{
		assertEquals(2, calc.devide(9, 4));
	}
	
	@After
	public void tearDown()
	{
		calc = null;
	}
}
