package com.meennu.javabook.chap1;

import java.util.ArrayList;
import java.util.List;

public class ImprovedReadabilityExample {

	public static void exampleWithoutGenerics() {
		List commonList = new ArrayList();
		commonList.add("Hello");
		commonList.add(123); // Adds an integer, which might not be intentional

		for (Object obj : commonList) {
			String str = (String) obj; // Requires casting, prone to runtime errors
			System.out.println(str);
		}
	}

	public static void exampleWithGenerics() {
		List<String> stringList = new ArrayList<>();
		stringList.add("Hello");
		// stringList.add(123); // Compile-time error, prevents adding incompatible data
		for (String str : stringList) {
			System.out.println(str); // No casting needed, easier to read
		}
	}

}
