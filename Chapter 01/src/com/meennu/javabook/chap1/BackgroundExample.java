package com.meennu.javabook.chap1;

import java.util.ArrayList;
import java.util.List;

public class BackgroundExample {

	public static void listWithoutGenericsExample() {
		List listWithoutGenerics = new ArrayList();
		listWithoutGenerics.add("A String");
		Integer number = (Integer) listWithoutGenerics.get(0); // Runtime error

	}

	public static void listWithGenericsExample() {
		List<String> stringList = new ArrayList<>();
		stringList.add("A String");
		// Integer number = (Integer) stringList .get(0); // Compile-time error
		String text = stringList.get(0); // Compile-time safety ensures no casting error
	}

}
