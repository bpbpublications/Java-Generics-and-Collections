package com.meennu.javabook.chap9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingWithCustomComparator {
	
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Banana", "Apple", "Mango");
		Collections.sort(fruits, (a, b) -> b.compareTo(a)); // Reverse alphabetical
		System.out.println(fruits); 
	}

}
