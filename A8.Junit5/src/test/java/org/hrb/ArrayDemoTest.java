package org.hrb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayDemoTest {

	@Test
	void testReturnArray() {
		
		ArrayDemo demo=new ArrayDemo();
		int[] actual=demo.returnArray();
		int[] expected= {1,2,3};
		assertArrayEquals(expected, actual,"additional message of the test!");
		
	
	}

}
