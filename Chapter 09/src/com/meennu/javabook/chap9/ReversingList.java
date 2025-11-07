package com.meennu.javabook.chap9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversingList {
	
	public static void main(String[] args) {
		List<String> students = Arrays.asList("Aarav", "Bhavna", "Chirag");
		Collections.reverse(students);
		System.out.println(students); 
	}

}
