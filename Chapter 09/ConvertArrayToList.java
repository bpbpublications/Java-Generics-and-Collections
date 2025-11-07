package com.meennu.javabook.chap9;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
	public static void main(String[] args) {
		List<String> users = Arrays.asList("Kiran", "Meena", "Rahul");
		String[] userArray = users.toArray(new String[0]);
		System.out.println(Arrays.toString(userArray)); 
	}
}
