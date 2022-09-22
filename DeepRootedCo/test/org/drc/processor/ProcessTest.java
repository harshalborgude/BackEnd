package org.drc.processor;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.drc.model.MatchedOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProcessTest {

	Process process=new Process();

	@Test
	public void test1() {
		
		List<String> inputList = new ArrayList<>(
				Arrays.asList(
						"s1 09:45 tomato 24/kg 100kg",
						"s2 09:46 tomato 20/kg  90kg",
						"d1 09:47 tomato 22/kg 110kg",
						"d2 09:48 tomato 21/kg  10kg",
						"d3 09:49 tomato 21/kg  40kg",
						"s3 09:50 tomato 19/kg  50kg"));
		
		List<MatchedOrder> matchedOrder = new ArrayList<>(
				Arrays.asList( 
						new MatchedOrder("d1", "s2", 20, 90),
						new MatchedOrder("d1", "s3", 19, 20),
						new MatchedOrder("d2", "s3", 19, 10),
						new MatchedOrder("d3", "s3", 19, 20) )); 
	
		List<MatchedOrder> response = process.processList(inputList);
		
		assertEquals(matchedOrder, response);

	
	}
	
	@Test
	public void test2() {
		
		List<String> inputList = new ArrayList<>(
				Arrays.asList(
						"d1 09:47 tomato 110/kg 1kg",
						"d2 09:45 potato 110/kg 10kg",
						"d3 09:48 tomato 110/kg 10kg",
						"s1 09:45 potato 110/kg 1kg",
						"s2 09:45 potato 110/kg 7kg",
						"s3 09:45 potato 110/kg 2kg",
						"s4 09:45 tomato 110/kg 11kg"));
		
		List<MatchedOrder> matchedOrder = new ArrayList<>(
				Arrays.asList( 
						new MatchedOrder("d2", "s1", 110, 1),
						new MatchedOrder("d2", "s2", 110, 7),
						new MatchedOrder("d2", "s3", 110, 2),
						new MatchedOrder("d1", "s4", 110, 1),
						new MatchedOrder("d3", "s4", 110, 10))); 
	
		List<MatchedOrder> response = process.processList(inputList);
		
		assertEquals(matchedOrder, response);
		
	}

}
