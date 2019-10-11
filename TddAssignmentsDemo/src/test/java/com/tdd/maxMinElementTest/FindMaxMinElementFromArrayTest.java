package com.tdd.maxMinElementTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tdd.maxMinElement.FindMaxMinElementFromArray;

public class FindMaxMinElementFromArrayTest {

	@Test
	public void shouldReturnMinElementFromGivenArrayIfNumTypeIsMin() {
		FindMaxMinElementFromArray findMaxMinElementFromArray = new FindMaxMinElementFromArray();
		Integer[] inputArray = { 12, 4, 5, 6, 8, 100 };
		int minNumber = findMaxMinElementFromArray.findMaxMinElementsOfArray(inputArray, "min");
		assertEquals(4, minNumber);
	}
	
	@Test
	public void shouldReturnMaxElementFromGivenArrayIfNumTypeIsMax() {
		FindMaxMinElementFromArray findMaxMinElementFromArray = new FindMaxMinElementFromArray();
		Integer[] inputArray = { 12, 4, 5, 6, 8, 100 };
		int maxNumber = findMaxMinElementFromArray.findMaxMinElementsOfArray(inputArray, "max");
		assertEquals(100, maxNumber);
	}
	@Test
	public void shouldReturnZeroIfElementsNumTypeIsWrong() {
		FindMaxMinElementFromArray findMaxMinElementFromArray = new FindMaxMinElementFromArray();
		Integer[] inputArray = { 12, 4, 5, 6, 8, 100 };
		int zeroElement = findMaxMinElementFromArray.findMaxMinElementsOfArray(inputArray, "test");
		assertEquals(0, zeroElement);
	}
	

}
