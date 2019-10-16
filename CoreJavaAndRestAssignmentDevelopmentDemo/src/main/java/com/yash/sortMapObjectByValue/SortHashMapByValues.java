package com.yash.sortMapObjectByValue;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;

public class SortHashMapByValues {
	public HashMap<String, Integer> sortMapByValues(HashMap<String, Integer> givenMap) {

//		System.out.println(givenMap);
		List<Map.Entry<String, Integer>> listOfMapEntries = new LinkedList<Map.Entry<String, Integer>>(
				givenMap.entrySet());
//		System.out.println(listOfMapEntries);

		Collections.sort(listOfMapEntries, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : listOfMapEntries) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

}
