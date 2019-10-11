package com.tdd.spyNumberTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import com.tdd.spyNumber.SpyNumberDemo;

import junit.framework.Assert;

public class SpyNumberDemoTest {

	@Test
	public void shouldReturnTrueIfGivenNumberIsSpyNumber() {
		SpyNumberDemo spyNumberDemo = new SpyNumberDemo();
		boolean actual = spyNumberDemo.findSpyNumber(123);
		assertEquals(true, actual);
	}

	@Test
	public void shouldReturnFalseIfGivenNumberIsSpyNumber() {
		SpyNumberDemo spyNumberDemo = new SpyNumberDemo();
		boolean actual = spyNumberDemo.findSpyNumber(125);
		assertEquals(false, actual);

	}

}
