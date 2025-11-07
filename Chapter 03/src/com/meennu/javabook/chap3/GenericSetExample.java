package com.meennu.javabook.chap3;

import java.util.Set;
import java.util.HashSet;

public class GenericSetExample {
	public static void main(String[] args) {
		Set<String> stringSet = new HashSet<>();
		stringSet.add("item1");
		stringSet.add("item2");
		stringSet.add("item3");

		for (String item : stringSet) {
			System.out.println(item);
		}
	}
}