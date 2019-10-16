package com.yash.singletonWithThreadSafe;

public class SingleToneWithThreadSafeDemo {

	private static SingleToneWithThreadSafeDemo object;

	private SingleToneWithThreadSafeDemo() {
		System.out.println("Singleton(): Private constructor invoked");
	}

	public static SingleToneWithThreadSafeDemo getInstance() {
		if (object == null) {

			synchronized (SingleToneWithThreadSafeDemo.class) {
				if (object == null) {
					object = new SingleToneWithThreadSafeDemo();
				}
			}
		}
		return object;
	}

}
