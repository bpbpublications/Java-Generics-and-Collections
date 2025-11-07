package com.meennu.javabook.chap3;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListExample {
	public static void main(String[] args) {
		List nonGenericList = new ArrayList(); // Raw type list
		nonGenericList.add("Java"); // String added
		nonGenericList.add(100); // Integer added (no compile-time error)
	}

	public static void fetchItems(List nonGenericListItems) {
		String item1 = (String) nonGenericListItems.get(0); // Explicit casting (safe)
		String item2 = (String) nonGenericListItems.get(1); // Runtime error! ClassCastException

		System.out.println(item1);
		System.out.println(item2); // This will cause an error
	}
}
