package com.meennu.javabook.chap9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedCollections {
	public static void main(String[] args) {
		List studentNames = new ArrayList(); // raw type
		studentNames.add("Anita");
		studentNames.add(101); // No compile-time error
		String name = (String) studentNames.get(1); // ClassCastException at runtime
		List<String> names = new ArrayList<>();
		List<String> checkedNames = Collections.checkedList(names, String.class);

		checkedNames.add("Anita");
		//checkedNames.add(101); // Compilation fails
	}
}
