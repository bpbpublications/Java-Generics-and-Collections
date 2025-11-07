package com.meennu.javabook.chap5;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		// Creating a Vector of integers
		Vector<Integer> numbers = new Vector<>();

		// Adding elements
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);

		// Accessing elements
		System.out.println("First Element: " + numbers.firstElement());
		System.out.println("Last Element: " + numbers.lastElement());

		// Removing an element
		numbers.remove(2); // Removes 30

		// Displaying the Vector
		System.out.println("Updated Vector: " + numbers);
	}
}
