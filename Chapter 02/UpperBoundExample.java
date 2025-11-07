package com.meennu.javabook.chap2;

import java.util.Arrays;
import java.util.List;

public class UpperBoundExample {
	public static <T extends Comparable<T>> T fetchMaxElement(List<T> list) {
		if (list == null || list.isEmpty()) {
			throw new IllegalArgumentException("List cannot be null or empty");
		}

		T max = list.get(0);
		for (T element : list) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		List<String> listOfNames = Arrays.asList("Apple", "Carrot", "Grapes");
		String maxName = fetchMaxElement(listOfNames); // Valid, String implements Comparable<String>

		List<Integer> listOfAges = Arrays.asList(25, 30, 20);
		Integer maxAge = fetchMaxElement(listOfAges); // Valid, Integer implements Comparable<Integer>

	}

}
