package com.tdd.maxMinElement;

import java.util.Arrays;

public class FindMaxMinElementFromArray {
	public Integer findMaxMinElementsOfArray(Integer[] array, String numType) {
		Integer[] array1 = array;
		Arrays.sort(array);

		System.out.println("Minimum Element=" + array1[0]);
		System.out.println("Maximum element=" + array1[array1.length - 1]);

		if (numType.equals("min"))
			return array1[0];
		else if (numType.equals("max"))
			return array1[array1.length - 1];

		return 0;

	}

	public static void main(String[] args) {
		// Integer[] inputArray = { 12, 6, 7, 4, 5, 78 };
		// FindMaxMinElementFromArray findMaxMin = new
		// FindMaxMinElementFromArray();
		// findMaxMin.findMaxMinElementsOfArray(inputArray);
		// for (int i = 0; i < inputArray.length; i++) {
		// System.out.print(inputArray[i] + " ");
		// }

	}

}
