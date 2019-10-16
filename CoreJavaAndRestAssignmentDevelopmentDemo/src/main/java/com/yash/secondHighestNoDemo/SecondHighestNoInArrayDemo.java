package com.yash.secondHighestNoDemo;

public class SecondHighestNoInArrayDemo {

	public Integer findHighestNo(Integer[] inputarray) {

		Integer largestNo = inputarray[0];
		Integer secondLargestNo = inputarray[0];
		
		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i] > largestNo) {
				secondLargestNo = largestNo;
				largestNo = inputarray[i];
			} else if (inputarray[i] > secondLargestNo) {
				secondLargestNo = inputarray[i];
			}

		}

		return secondLargestNo;
	}

	
}
