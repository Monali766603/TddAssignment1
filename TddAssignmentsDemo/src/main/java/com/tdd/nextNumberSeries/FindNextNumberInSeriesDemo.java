package com.tdd.nextNumberSeries;

import java.util.ArrayList;
import java.util.List;

public class FindNextNumberInSeriesDemo {
	public Integer findNextNumberInSeries(List<Integer> list) {

		Integer value = list.get(0);
		
		for (Integer i = 0; i < list.size(); i++) {
			
			if (i % 2 == 0) {
				
				value = value + 3;
				
			} else {
				
				value = value - 2;
			}
		}

		return value;

	}
	
	
	

}
