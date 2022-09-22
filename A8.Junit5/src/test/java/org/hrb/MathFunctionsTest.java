package org.hrb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


// assertions is by default method provided by junit.
//@BeforeEach - this will get executed before executing each of test case and will get the object of MathFunctions.
//@AfterEach- this will get executed after each method so will get msg 4 time.
//	@BeforeAll - this get executed before all the methods.
// @AfterAll - this get executed after all the methods - used to cleanup things.

// this annotation is provided 
@TestInstance(Lifecycle.PER_METHOD)
class MathFunctionsTest {

	//MathFunctions math=new MathFunctions();
	MathFunctions math;
	
	@BeforeAll
	static public void beforeAll(){
		System.out.println("before all!");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("after all");
	}
	
	// This before each method,this will get executed before executing each of test case and will get the object of MathFunctions.
	@BeforeEach
	void beforeEach() {
		 math=new MathFunctions();
	}
	
	// this will get executed after each method so will get msg 4 time.
	@AfterEach
	void afterEach() {
		 System.out.println("Executed after each!");
	}
	
	@Test
	@Tag("runIt")
	void testAdd() {
		
		//MathFunctions mathFunctions=new MathFunctions();
		int expected=14;
		int result = math.add(10, 4);
		 
		assertEquals(expected, result,"addition operation failed!");
		
	}
	
	@Test
	@Tag("runIt")
	void testSub() {
		//MathFunctions math=new MathFunctions();
		int expected=10;
		int result=math.sub(20, 10);
		assertEquals(expected, result,"substraction operation failed!");
	}
	
	@Test
	void testMul() {
		//MathFunctions math=new MathFunctions();
		int expected=20;
		int result=math.mul(10, 2);
		assertEquals(expected, result,"multiplication operation failed!");
	}
	
	@Test
	@DisplayName("assert all example")
	//@Disabled
	
	void testDivide() {
		//MathFunctions math=new MathFunctions();
		/*int expected=5;
		int result=math.divide(10,2);
		assertEquals(expected, result,"division operation failed!");
		//assertThrows(ArithmeticException.class, ()->math.divide(10,2),"ArithmeticException expeccted!");
		*/
		
		
		assertAll(()-> assertEquals(5, math.divide(10,2)),
				 // ()-> assertThrows(ArithmeticException.class, ()-> math.divide(10, 2)),
				  ()-> assertEquals(5, math.divide(10, 2))
				
					
				);
		
	}
	
	@Test
	@RepeatedTest(5)
	void repeatMe() {
		System.out.println("I am alive!");
	}

}






