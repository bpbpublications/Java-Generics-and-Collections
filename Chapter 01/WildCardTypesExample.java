package com.meennu.javabook.chap1;

import java.util.Arrays;
import java.util.List;

public class WildCardTypesExample {

	public static void printList(List<?> anyList) {
		for (Object listObj : anyList) {
			System.out.println(listObj);
		}
	}

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("String", "List");
		printList(listOfStrings); // Output: String \n List

		List<Integer> listOfIntegers = Arrays.asList(101, 201, 301);
		printList(listOfIntegers); // Output: 101 \n 201 \n 301

		List<Double> listOfDoubles = Arrays.asList(3.14, 2.71);
		printList(listOfDoubles); // Output: 3.14 \n 2.71

	}

}
