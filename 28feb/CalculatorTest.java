package com.cts.training.tests;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.calculator.Calculator;

public class CalculatorTest {

	private static Calculator calculator;
	
	@BeforeClass
	public static void init()
	{
		calculator = new Calculator();
		System.out.println("Object Created!!");
		
	}
	
	@AfterClass
	public static void destroy()
	{
		calculator=null;
		System.out.println("Object Destroyed!");
	}
	@Ignore
	@Test
	public void test_add_success() {
		
		assertEquals(17, calculator.add(12, 5));
		System.out.println("Inside Test!!");
		
	}
	@Ignore
	@Test
	public void test_sub_success() {
		
		assertEquals(7, calculator.sub(5, 12));
		System.out.println("Inside Sub Test!!");
		
	}
	@Ignore
	@Test
	public void test_mul_success() {
		
		assertEquals(32, calculator.mul(4, 8));
		System.out.println("Inside mul Test!!");
		
	}
	@Ignore
	@Test
	public void test_div_success() {
		
		assertEquals(2, calculator.div(8, 4));
		System.out.println("Inside Div Test!!");
		
	}
	
	@Test
	public void test_to_check_prime_number_success() {
		
		assertEquals(true, calculator.isPrime(5));
		System.out.println("Inside Prime Test!!");
		
	}
	@Test
	public void test_to_check_prime_number_fail() {
		
		assertEquals(false, calculator.isPrime(4));
		System.out.println("Inside Prime Test!!");
		
	}


}
