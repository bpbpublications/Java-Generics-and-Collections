package com.meennu.javabook.chap4;

import java.util.ArrayList;
import java.util.Collection;

public class AddElementExample {
	public static void main(String[] args) {
		Collection<String> names = new ArrayList<>();
		names.add("Ryan");
		names.add("Roger");
		
		boolean checkAddReturn = names.add("Royce");		
		System.out.println(checkAddReturn);// Output: true

		System.out.println(names); // Output: [Ryan, Roger, Royce]
	}

}
