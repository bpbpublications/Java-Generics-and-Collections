package com.meennu.javabook.chap7;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<>();
		names.add("Ajay");
		names.add("Bilal");
		names.add("Chari");

		System.out.println(names);  // Output: [Ajay, Bilal, Chari]
	}

}
