package com.yash.countCharacterOfString;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

public class CountCharacterOfStringTest {
	@Test
	public void shoulReturnCountOfCharactersIfStringIsGiven() {
		CountCharacterOfString countCharacterOfString = new CountCharacterOfString();
		String inputString = "iamyashemployee";
		HashMap<Character, Integer> actualMap = countCharacterOfString.getCountOfCharactersOfString(inputString);
		System.out.println("No of counts of characters in string:" + actualMap);
		HashMap<Character, Integer> inputMap = new HashMap<Character, Integer>();
		inputMap.put('i', 1);
		inputMap.put('a', 2);
		inputMap.put('y', 2);
		inputMap.put('s', 1);
		inputMap.put('h', 1);
		inputMap.put('m', 2);
		inputMap.put('e', 3);
		inputMap.put('p', 1);
		inputMap.put('l', 1);
		inputMap.put('o', 1);
		// System.out.println(inputMap);

		assertTrue(inputMap.equals(actualMap));

	}

	@Test(expected = StringNotFoundException.class)
	public void shouldThrowExceptionIfStringIsNotGiven() {
		CountCharacterOfString countCharacterOfString = new CountCharacterOfString();
		String inputString = "";
		HashMap<Character, Integer> actualResult = countCharacterOfString.getCountOfCharactersOfString(inputString);
		System.out.println(actualResult);

	}

	@Test(expected = StringNotFoundException.class)
	public void shouldThrowExceptionIfStringIsNull() {
		CountCharacterOfString countCharacterOfString = new CountCharacterOfString();
		String inputString = null;
		HashMap<Character, Integer> actualResult = countCharacterOfString.getCountOfCharactersOfString(inputString);
		System.out.println(actualResult);

	}

}
