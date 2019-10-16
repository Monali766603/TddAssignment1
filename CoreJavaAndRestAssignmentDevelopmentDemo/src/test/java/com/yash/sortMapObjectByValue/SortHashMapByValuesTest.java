package com.yash.sortMapObjectByValue;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class SortHashMapByValuesTest {

	@Test
	public void shouldSortMapObjectByValuesInAscendingOrder() {
		SortHashMapByValues sortHashMapByValues = new SortHashMapByValues();
		HashMap<String, Integer> inputMap = new HashMap<>();
		inputMap.put("Lenovo Laptop", 25000);
		inputMap.put("HP Laptop", 15000);
		inputMap.put("Sony Laptop", 10000);
		inputMap.put("Dell Laptop", 18000);
		Map<String, Integer> actualMap = sortHashMapByValues.sortMapByValues(inputMap);

		System.out.println(actualMap);

		HashMap<String, Integer> hashMap = new LinkedHashMap<String, Integer>();

		hashMap.put("Sony Laptop", 10000);
		hashMap.put("HP Laptop", 15000);
		hashMap.put("Dell Laptop", 18000);
		hashMap.put("Lenovo Laptop", 25000);
		System.out.println(hashMap);

		assertEquals(hashMap.toString(), actualMap.toString());

	}

}
