package com.yash.sumOfEvenIntFromArray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfEvenIntFromArrayTest {
	@Test
	public void shouldReturnSumOfEvenIntegerFromGivenArray() {

		Integer[] inputArray = { 12, 7, 9, 15, 26, 10 };
		SumOfEvenIntFromArray sumOfEvenIntFromArray = new SumOfEvenIntFromArray();
		Integer actualResult = sumOfEvenIntFromArray.getSumOfEvenIntegerFromArray(inputArray);
		Integer expected = 48;
		assertEquals(expected, actualResult);

	}

}
