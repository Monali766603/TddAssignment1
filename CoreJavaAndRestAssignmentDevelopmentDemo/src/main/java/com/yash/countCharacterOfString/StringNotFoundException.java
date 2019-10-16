package com.yash.countCharacterOfString;

import java.util.concurrent.RejectedExecutionHandler;

public class StringNotFoundException extends RuntimeException {

	public StringNotFoundException(String message) {

		super(message);
	}

}
