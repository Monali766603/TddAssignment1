package com.tdd.letterCapitalizeTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tdd.letterCapitalize.LetterCapitalizeDemo;

public class LetterCapitalizeDemoTest {
	@Test
	public void shouldCapitalizeFirstAndLastLetterOfGivenString() {
		LetterCapitalizeDemo letterCapitalizeDemo = new LetterCapitalizeDemo();
		StringBuilder actualSb = letterCapitalizeDemo.capitalizeFirstAndLastLetterOfString("welcome to yash");
		System.out.println(actualSb);
		assertEquals("WelcomE TO YasH ", actualSb.toString());
	}

	@Test(expected = RuntimeException.class)
	public void shouldCheckStringIsEmpty() {
		LetterCapitalizeDemo letterCapitalizeDemo = new LetterCapitalizeDemo();
		StringBuilder actualSb = letterCapitalizeDemo.capitalizeFirstAndLastLetterOfString("");
		// assertEquals("", actualSb);
	}

	@Test(expected = RuntimeException.class)
	public void shouldCheckStringIsNull() {
		LetterCapitalizeDemo letterCapitalizeDemo = new LetterCapitalizeDemo();
		StringBuilder actualSb = letterCapitalizeDemo.capitalizeFirstAndLastLetterOfString(null);
		// assertEquals(null, actualSb);
	}

}
