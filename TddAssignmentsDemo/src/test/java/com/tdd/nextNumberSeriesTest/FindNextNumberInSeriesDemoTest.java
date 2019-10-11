package com.tdd.nextNumberSeriesTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.tdd.nextNumberSeries.FindNextNumberInSeriesDemo;

public class FindNextNumberInSeriesDemoTest {

	@Test
	public void shouldReturnNextNumberInSeries() {

		FindNextNumberInSeriesDemo findNextNumberInSeriesDemo = new FindNextNumberInSeriesDemo();
		List<Integer> listOfNumbers = Arrays.asList(7, 10, 8, 11, 9, 12);
		Integer actualNum = findNextNumberInSeriesDemo.findNextNumberInSeries(listOfNumbers);
		Integer expected = 10;
		System.out.println(actualNum);
		assertEquals(expected, actualNum);

	}

}
