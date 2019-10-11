package com.tdd.spyNumber;

import java.util.Scanner;

public class SpyNumberDemo {
	public boolean findSpyNumber(Integer number) {
		Integer sum = 0;
		Integer product = 1;
		Integer reminder;

		while (number > 0) {
			reminder = number % 10;
			sum = sum + reminder;
			product = product * reminder;
			number = number / 10;
		}
		if (sum == product) {
			return true;
		}

		return false;

	}

	/*public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner scan = new Scanner(System.in);
		Integer inputNumber = scan.nextInt();
		SpyNumberDemo spyNumber = new SpyNumberDemo();
		System.out.println("Is Entered number Spy:" + spyNumber.findSpyNumber(inputNumber));
	}*/

}
