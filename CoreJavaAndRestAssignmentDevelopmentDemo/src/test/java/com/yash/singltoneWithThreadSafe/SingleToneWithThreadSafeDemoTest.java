package com.yash.singltoneWithThreadSafe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.singletonWithThreadSafe.SingleToneWithThreadSafeDemo;

public class SingleToneWithThreadSafeDemoTest {
	@Test
	public void shouldPreventSingletonePatternFromThreadSafe() {

		SingleToneWithThreadSafeDemo demo1 = SingleToneWithThreadSafeDemo.getInstance();
		SingleToneWithThreadSafeDemo demo2 = SingleToneWithThreadSafeDemo.getInstance();
		assertEquals(demo2, demo1);
	}

}
