package com.meennu.javabook.chap1;

import java.util.ArrayList;
import java.util.List;

public class PerformanceOptimizationExample {

	public static void exampleWithoutGenerics() {
		List commonList = new ArrayList();
		commonList.add("Hello");
		String str = (String) commonList.get(0); // Casting happens at runtime

	}

	public static void exampleWithGenerics() {
		List<String> stringList = new ArrayList<>();
		stringList.add("Hello");
		String str = stringList.get(0); // No casting required, type is known at compile time
	}

}
