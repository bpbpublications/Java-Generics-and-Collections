package com.meennu.javabook.chap9;

import java.util.Arrays;

public class SearchingArray {
	public static void main(String[] args) {
		int[] marks = {70, 75, 80, 83, 88, 90, 95};
		int index = Arrays.binarySearch(marks , 88);
		System.out.println(index);
	}
}
