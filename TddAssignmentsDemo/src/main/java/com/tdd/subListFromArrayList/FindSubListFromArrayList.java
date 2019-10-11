package com.tdd.subListFromArrayList;

import java.util.ArrayList;
import java.util.List;

public class FindSubListFromArrayList {
	public List<Integer> findSubListFromArrayList(int i, int j) {

		List<Integer> listOfInteger = new ArrayList<Integer>();
		listOfInteger.add(5);
		listOfInteger.add(10);
		listOfInteger.add(15);
		listOfInteger.add(20);
		listOfInteger.add(12);
		listOfInteger.add(8);
		listOfInteger.add(25);
		System.out.println("Original List:" + listOfInteger);
		List<Integer> subListOfInteger = listOfInteger.subList(i, j);

		return subListOfInteger;

	}

	

}
