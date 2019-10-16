package com.yash.secondHighestNoDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SecondHighestNoInArrayDemoTest {

	@Test
	public void shouldReturnSecondHighestNoInGivenArray() {

		SecondHighestNoInArrayDemo secondHighestNoInArrayDemo = new SecondHighestNoInArrayDemo();
		Integer intArray[] = { 12, 6, 25, 45, 33, 2, 55 };
		Integer actualResult = secondHighestNoInArrayDemo.findHighestNo(intArray);
		Integer expected = 45;
		assertEquals(expected, actualResult);
	}

}
