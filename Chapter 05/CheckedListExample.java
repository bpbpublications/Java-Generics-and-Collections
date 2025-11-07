package com.meennu.javabook.chap5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedListExample {
	
	public static void main(String args[]) {
		List rawList = new ArrayList(); // raw type
		List<String> checkedList = Collections.checkedList(rawList, String.class);

		checkedList.add("Hello");  // Valid
		rawList.add(10);           // Compiles, but will cause a runtime error

		System.out.println(checkedList.get(1)); // Throws ClassCastException

	}

}
