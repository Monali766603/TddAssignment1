package com.tdd.numberOfVowelsTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.tdd.numberOfVowels.NumbersOfVowels;

public class NumberOfVowelsTest {
	@Test
	public void shouldReturnTotalNumberOfVowelsFromGivenString() {

		NumbersOfVowels numbersOfVowels = new NumbersOfVowels();
		Integer actual = numbersOfVowels.FindNumberOfVowels("Welcome to yash ui");
		System.out.println(actual);
		assertTrue(7 == actual);

	}

}
