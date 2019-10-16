package com.yash.anagramString;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramStringDemoTest {
	@Test
	public void shouldReturnTrueIfGivenStringsAreAnagram() {
		AnagramStringDemo anagramStringDemo = new AnagramStringDemo();
		String inputString1 = "keep";
		String inputString2 = "peek";

		Boolean actualResult = anagramStringDemo.shouldCheckGivenTwoStringsAreAnagramOrNot(inputString1, inputString2);
		System.out.println(actualResult);
		assertTrue(actualResult);

	}

	@Test
	public void shouldReturnFalseIfGivenStringsAreNotAnagram() {
		AnagramStringDemo anagramStringDemo = new AnagramStringDemo();
		String inputString1 = "Mothers In Law";
		String inputString2 = "Hitler Women";

		Boolean actualResult = anagramStringDemo.shouldCheckGivenTwoStringsAreAnagramOrNot(inputString1, inputString2);
		System.out.println(actualResult);
		assertFalse(actualResult);

	}
	
	@Test
	public void shouldReturnFalseIfGivenFirstStringsIsBiggerThanSecondString() {
		AnagramStringDemo anagramStringDemo = new AnagramStringDemo();
		String inputString1 = "aabc";
		String inputString2 = "abc";

		Boolean actualResult = anagramStringDemo.shouldCheckGivenTwoStringsAreAnagramOrNot(inputString1, inputString2);
		System.out.println(actualResult);
		assertFalse(actualResult);

	}
	
	@Test
	public void shouldReturnFalseIfGivenFirstStringsIsSmallerThanSecondString() {
		AnagramStringDemo anagramStringDemo = new AnagramStringDemo();
		String inputString1 = "abc";
		String inputString2 = "aabc";

		Boolean actualResult = anagramStringDemo.shouldCheckGivenTwoStringsAreAnagramOrNot(inputString1, inputString2);
		System.out.println(actualResult);
		assertFalse(actualResult);

	}
	
	

}
