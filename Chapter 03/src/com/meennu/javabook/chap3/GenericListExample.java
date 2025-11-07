package com.meennu.javabook.chap3;

import java.util.ArrayList;
import java.util.List;

public class GenericListExample {
	public static void main(String[] args) {
		List<String> genericList = new ArrayList<>(); // Type-safe list
		genericList.add("Java");
		// list.add(100); // Compilation error - only Strings allowed

		String item1 = genericList.get(0); // No explicit casting needed
		System.out.println(item1); // Output: Java
	}
}
