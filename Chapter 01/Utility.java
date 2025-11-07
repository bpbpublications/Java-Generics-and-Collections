package com.meennu.javabook.chap1;

import java.util.HashMap;
import java.util.Map;

public class Utility {
	public static <E> void displayArray(E[] dataArray) { // E is the type parameter
		for (E displayItem : dataArray) {
			System.out.print(displayItem + " ");
		}
		System.out.println();
	}

	public static <K, V> void displayMap(Map<K, V> dataMap) {
		for (Map.Entry<K, V> displayEntry : dataMap.entrySet()) {
			System.out.println("Key: " + displayEntry.getKey() + ", Value: " + displayEntry.getValue());
		}
	}

	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3 };
		Utility.displayArray(numbers); // E is inferred as Integer

		String[] words = { "a", "b", "c" };
		Utility.displayArray(words); // E is inferred as String

		Map<String, Integer> ages = new HashMap<>();
		ages.put("Alice", 30);
		ages.put("Bob", 25);
		Utility.displayMap(ages);

	}
}
