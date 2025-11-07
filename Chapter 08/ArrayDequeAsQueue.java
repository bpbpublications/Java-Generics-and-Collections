package com.meennu.javabook.chap8;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAsQueue {
	
	public static void main(String[] args) {
		Deque<String> queue = new ArrayDeque<>();

		queue.addLast("Alice");
		queue.addLast("Bob");
		queue.addLast("Charlie");

		System.out.println(queue.removeFirst());
		System.out.println(queue.peekFirst());

	}

}
