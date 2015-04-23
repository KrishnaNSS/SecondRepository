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
		assertEquals(12, calc.add(9, 4));
	}
	
	@After
	public void tearDown()
	{
		calc = null;
	}
}
