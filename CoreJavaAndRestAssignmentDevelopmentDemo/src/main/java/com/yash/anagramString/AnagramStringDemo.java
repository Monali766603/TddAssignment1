package com.yash.anagramString;

import java.util.HashMap;
import java.util.Map;

public class AnagramStringDemo {
	public Boolean shouldCheckGivenTwoStringsAreAnagramOrNot(String sourceString, String targetString) {
		char[] charArrayOfSourceString = sourceString.toCharArray();
		HashMap<Character, Integer> hashMapOfChar = new HashMap<Character, Integer>();
		for (char ch : charArrayOfSourceString) {
			if (hashMapOfChar.containsKey(ch)) {
				hashMapOfChar.put(ch, hashMapOfChar.get(ch) + 1);
			} else {
				hashMapOfChar.put(ch, 1);
			}
		}

		char[] charArrayOfTargetString = targetString.toCharArray();
		for (char ch : charArrayOfTargetString) {
			if (hashMapOfChar.containsKey(ch)) {
				if (hashMapOfChar.get(ch) - 1 < 0)
					return false;
				hashMapOfChar.put(ch, hashMapOfChar.get(ch) - 1);

			}
			else{
				return false;
			}
		}
		for(Map.Entry<Character, Integer> entry:hashMapOfChar.entrySet()){
			if(entry.getValue()>0)
				return false;
		}
		
		return true;

	}

}
