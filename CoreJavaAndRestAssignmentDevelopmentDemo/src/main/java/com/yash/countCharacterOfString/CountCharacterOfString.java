package com.yash.countCharacterOfString;

import java.util.HashMap;

public class CountCharacterOfString {

	public HashMap<Character, Integer> getCountOfCharactersOfString(String givenString) {

		if (givenString == "" || givenString == null) {
			throw new StringNotFoundException("empty string");
		}

		HashMap<Character, Integer> mapOfCharacter = new HashMap<Character, Integer>();
		char[] charArrayOfGivenString = givenString.toCharArray();

		for (char ch : charArrayOfGivenString) {
			if (mapOfCharacter.containsKey(ch)) {
				mapOfCharacter.put(ch, mapOfCharacter.get(ch) + 1);

			} else {
				mapOfCharacter.put(ch, 1);
			}
		}

		return mapOfCharacter;

	}

}
