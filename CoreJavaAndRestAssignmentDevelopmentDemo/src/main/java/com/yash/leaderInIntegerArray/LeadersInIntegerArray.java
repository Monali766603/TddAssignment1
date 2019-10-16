package com.yash.leaderInIntegerArray;

public class LeadersInIntegerArray {

	public void findAllLeadersInArray(Integer array[]) {
		Integer max = array[array.length - 1];
		System.out.print(max+" ");
		for (int i = array.length - 2; i >= 0; i--) {
			if (array[i] > max) {
				System.out.print(array[i] + " ");
				max = array[i];
			}

		}
		

	}

	

}
