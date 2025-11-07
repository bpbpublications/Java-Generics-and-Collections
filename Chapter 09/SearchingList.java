package com.meennu.javabook.chap9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchingList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		int index = Collections.binarySearch(list, 30);
		System.out.println("Index of 30: " + index); 
	}
}
