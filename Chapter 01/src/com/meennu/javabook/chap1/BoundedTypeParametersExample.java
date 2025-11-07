package com.meennu.javabook.chap1;

public class BoundedTypeParametersExample {

	public static <T extends Number> void processNumber(T number) {
		System.out.println(number.doubleValue());
	}

	public static void main(String[] args) {
		processNumber(5); // Integer is a Number
		processNumber(3.14); // Double is a Number
		// processNumber("hello");
	}

}
