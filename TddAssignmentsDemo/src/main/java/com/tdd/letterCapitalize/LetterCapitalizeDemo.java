package com.tdd.letterCapitalize;

public class LetterCapitalizeDemo {

	public StringBuilder capitalizeFirstAndLastLetterOfString(String string) {

		String inputString = string;

		String[] split = inputString.split(" ");

		StringBuilder sb = new StringBuilder();

		if (inputString == null || inputString == " ") {
			throw new RuntimeException("String is null or empty");
		}

		for (String str : split) {

			String first = str.substring(0, 1);
			String last = str.substring(str.length() - 1, str.length());
			String middle = str.substring(1, str.length() - 1);

			sb.append(first.toUpperCase() + middle + last.toUpperCase() + " ");
		}

		return sb;

	}

}
