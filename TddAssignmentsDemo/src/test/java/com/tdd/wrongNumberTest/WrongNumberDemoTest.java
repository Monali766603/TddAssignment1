package com.tdd.wrongNumberTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.tdd.wrongNumber.WrongNumberDemo;

public class WrongNumberDemoTest {
	@Test
	public void shouldReturnWrongNumberIfNumberIsPresent() {

		List<Integer> numberList = Arrays.asList(3, 12, 8, 19, 13, 32, 18, 42, 23, 52);
		WrongNumberDemo wrongNumberDemo = new WrongNumberDemo();
		Integer actualNumber = wrongNumberDemo.findWrongNumberInList(numberList);
		Integer expected = 19;
		System.out.println(actualNumber);
		assertEquals(expected, actualNumber);

	}

	@Test
	public void shouldReturnZeroIfWrongNumberIsNotPresent() {

		List<Integer> numberList = Arrays.asList(3, 12, 8, 22, 13, 32, 18, 42, 23, 52);
		WrongNumberDemo wrongNumberDemo = new WrongNumberDemo();
		Integer actualNumber = wrongNumberDemo.findWrongNumberInList(numberList);
		Integer expected = 0;
		System.out.println(actualNumber);
		assertEquals(expected, actualNumber);

	}

}
