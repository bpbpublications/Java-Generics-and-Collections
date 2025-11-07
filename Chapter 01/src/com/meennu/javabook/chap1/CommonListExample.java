package com.meennu.javabook.chap1;

import java.util.ArrayList;
import java.util.List;

public class CommonListExample {

	public static void commonListExample() {
		List commonList = new ArrayList();
		commonList.add("Hello");
		String text = (String) commonList.get(0);
	}

	public static void stringListExample() {
		List<String> stringList = new ArrayList<>();
		stringList.add("Hello");
		String text = stringList.get(0); // No casting required
	}

}
