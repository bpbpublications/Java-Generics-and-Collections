package com.meennu.javabook.chap3;

import java.util.List;
import java.util.ArrayList;

public class LowerBoundedWildcardListExample {
	public static void addIntegers(List<? super Integer> lowerBoundedList) {
		lowerBoundedList.add(10);
		lowerBoundedList.add(20);
		lowerBoundedList.add(30);
		// numbers.add(3.14); // Compilation error! Cannot add Double
		System.out.println("List after adding integers: " + lowerBoundedList);
	}

	public static void main(String[] args) {
		List<Number> numberList = new ArrayList<>();
		List<Object> objectList = new ArrayList<>();

		addIntegers(numberList);
		addIntegers(objectList);

		System.out.println(numberList); // Output: [10, 20, 30]
		System.out.println(objectList); // Output: [10, 20, 30]
	}
}
