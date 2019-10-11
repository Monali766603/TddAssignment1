package com.tdd.wrongNumber;

import java.util.List;

public class WrongNumberDemo {
	public int findWrongNumberInList(List<Integer> list) {

		int evenValue = list.get(0);
		int oddValue = list.get(1);

		for (int i = 2; i < list.size(); i++) {
			if (i % 2 == 0) {
				evenValue = evenValue + 5;
				if (evenValue != list.get(i)) {
					return list.get(i);
				}

			} else {
				oddValue = oddValue + 10;
				if (oddValue != list.get(i)) {
					return list.get(i);
				}
			}
		}

		return 0;

	}

}
