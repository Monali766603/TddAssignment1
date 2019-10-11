package com.tdd.numberOfVowels;

import java.util.Scanner;

public class NumbersOfVowels {

	public Integer FindNumberOfVowels(String str) {
		Integer count = 0;
		char[] stringArray = str.toCharArray();
		for (char ch : stringArray) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}

		}
		

		return count;

	}

}
