package com.tdd.replaceElementTest;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.tdd.replaceElement.ReplaceElementDemo;

public class ReplaceElementDemoTest {

	@Test
	public void shouldReplaceElementWithGivenElement() {

		ReplaceElementDemo replaceElementDemo = new ReplaceElementDemo();
		List<Integer> list = Arrays.asList(55, 25, 368);
		List<Integer> actualList = replaceElementDemo.replaceElementWithinArrayList(list, 25, 6);

	}

	@Test(expected = RuntimeException.class)
	public void shouldThrowExceptionIfElementToReplaceIsNull() {

		ReplaceElementDemo replaceElementDemo = new ReplaceElementDemo();
		List<Integer> list = Arrays.asList(55, 25, 368);
		List<Integer> actualList = replaceElementDemo.replaceElementWithinArrayList(list, null, 6);
		

	}

	@Test(expected = RuntimeException.class)
	public void shouldThrowExceptionIfElementToReplaceWithIsNull() {

		ReplaceElementDemo replaceElementDemo = new ReplaceElementDemo();
		List<Integer> list = Arrays.asList(55, 25, 368);
		List<Integer> actualList = replaceElementDemo.replaceElementWithinArrayList(list, 25, null);

	}

}
