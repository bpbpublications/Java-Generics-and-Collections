package com.meennu.javabook.chap8;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAsStack {
	
	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<>();

		stack.push("Page1");
		stack.push("Page2");
		stack.push("Page3");

		System.out.println(stack.pop()); // Page3
		System.out.println(stack.peek()); // Page2

	}

}
