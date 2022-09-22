package org.hrb.incubyte;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearTest {

	@Test
	public void test1() {
		// All years divisible by 400 ARE leap years 
		assertEquals(true, new LeapYear().isLeap(2000));
		
	}
	@Test
	public void test2() {
		// All years divisible by 100 but not by 400 are NOT leap years
		assertEquals(false, new LeapYear().isLeap(1800));
		
	}
	@Test
	public void test3() {
		// All years divisible by 4 but not by 100 ARE leap years
		assertEquals(true, new LeapYear().isLeap(2008));
		
	}
	@Test
	public void test4() {
		// All years not divisible by 4 are NOT leap years 
		assertEquals(false, new LeapYear().isLeap(2018));
		
	}
	
	
	
}
