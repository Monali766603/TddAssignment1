package com.yash.leaderInIntegerArray;

import org.junit.Test;

public class LeaderInIntegerArrayTest {

	@Test
	public void shouldReturnAllLeadersInArray() {

		LeadersInIntegerArray ladersInIntegerArray = new LeadersInIntegerArray();
		Integer[] inputArray = { 14, 9, 11, 7, 8, 5, 3 };
		ladersInIntegerArray.findAllLeadersInArray(inputArray);

	}

}
