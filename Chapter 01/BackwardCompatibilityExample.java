package com.meennu.javabook.chap1;

import java.util.ArrayList;
import java.util.List;

public class BackwardCompatibilityExample {
	public static void exampleWithoutGenerics() {
		List commonList = new ArrayList(); // Non-generic collection
		commonList.add("Hello");
		commonList.add(123);
		for (Object obj : commonList) {
			System.out.println(obj); // Outputs: Hello, 123
		}
	}

	public static void exampleWithGenerics() {
		List<String> stringList = new ArrayList<>(); // Generic collection
		stringList.add("Hello");
		// stringList.add(123); // Compile-time error
		for (String str : stringList) {
			System.out.println(str); // Outputs: Hello
		}
	}

	public static void nonGenericAndGeneric() {
		List oldList = new ArrayList(); // Non-generic
		oldList.add("Hello");

		List<String> newList = oldList; // Allowed but with warnings (raw type usage)
		System.out.println(newList.get(0)); // Still works
	}

}
