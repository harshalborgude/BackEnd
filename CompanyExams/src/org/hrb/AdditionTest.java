package org.hrb;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void addTest() {
		Addition add=new Addition();
		int result=add.add(3, 2);
		assertEquals(result,5 );
	}

}
