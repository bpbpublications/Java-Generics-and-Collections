package com.meennu.javabook.chap9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchWithCustomComparator {
	
	public static void main(String[] args) {
		List<String> items = Arrays.asList("X", "M", "A");
		Collections.sort(items, Comparator.reverseOrder()); // [X, M, A]
		int index = Collections.binarySearch(items, "M", Comparator.reverseOrder());
		System.out.println("Index of M: " + index); 
	}

}
