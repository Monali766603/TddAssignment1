package com.tdd.replaceElement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceElementDemo {

	public List<Integer> replaceElementWithinArrayList(List<Integer> list, Integer elementToReplace,
			Integer elementToReplaceWith) {
		if (elementToReplace == null || elementToReplaceWith == null) {
			throw new RuntimeException("elementToReplace or elementToReplaceWith is null");
		}

		Collections.replaceAll(list, elementToReplace, elementToReplaceWith);

		return list;

	}

}
