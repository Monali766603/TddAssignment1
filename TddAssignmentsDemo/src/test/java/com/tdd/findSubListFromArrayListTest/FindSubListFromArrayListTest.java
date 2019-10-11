package com.tdd.findSubListFromArrayListTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.tdd.subListFromArrayList.FindSubListFromArrayList;

public class FindSubListFromArrayListTest {
	@Test
	public void shouldReturnSubListFromGivenArrayList() {

		List<Integer> a = Arrays.asList(5, 10, 15, 20, 12, 8, 25);
		FindSubListFromArrayList findSubListFromArrayList = new FindSubListFromArrayList();
		List<Integer> actualSubList = findSubListFromArrayList.findSubListFromArrayList(0,5);
		assertEquals(a.subList(0, 5), actualSubList);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void shouldReturnArrayIndexOutOfBoundsException() {

		List<Integer> a = Arrays.asList(5, 10, 15, 20, 12, 8, 25);
		FindSubListFromArrayList findSubListFromArrayList = new FindSubListFromArrayList();
		List<Integer> actualSubList = findSubListFromArrayList.findSubListFromArrayList(4,90);
		
		
	}

}
