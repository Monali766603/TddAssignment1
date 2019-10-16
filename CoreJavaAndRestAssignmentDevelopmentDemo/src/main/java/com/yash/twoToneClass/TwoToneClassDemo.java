package com.yash.twoToneClass;

public class TwoToneClassDemo {
	private static TwoToneClassDemo obj;

	static int count = 0;

	private TwoToneClassDemo() {
		System.out.println("Singleton(): Private constructor invoked");

		count++;
	}
	

	public static TwoToneClassDemo getInstance() {

		if (count < 2) {
			obj = new TwoToneClassDemo();
		}

		return obj;

	}
}
