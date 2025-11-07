package com.meennu.javabook.chap9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NaturalOrderingExample {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 1, 3, 2);
		Collections.sort(numbers);
		System.out.println(numbers); 
	}

}
