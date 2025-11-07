package com.meennu.javabook.chap9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsOnArrays {
	public static void main(String[] args) {
		String[] names = {"Amit", "Bharat", "Chetna"};
		List<String> nameList = Arrays.asList(names);
		Collections.reverse(nameList);
		System.out.println(Arrays.toString(names)); 
	}
}
