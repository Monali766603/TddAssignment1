package com.yash.sumOfEvenIntFromArray;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SumOfEvenIntFromArray {
	public Integer getSumOfEvenIntegerFromArray(Integer[] array) {

		List<Integer> listOfInteger = Arrays.asList(array);
		Integer result=listOfInteger.stream().filter((e)-> e%2==0).mapToInt(e->e.intValue()).sum();

		return result;
		

	}

}
