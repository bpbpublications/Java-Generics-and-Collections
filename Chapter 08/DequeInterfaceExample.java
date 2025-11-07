package com.meennu.javabook.chap8;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterfaceExample {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		// Using deque as a queue (FIFO)
		deque.addLast("One");
		deque.addLast("Two");
		deque.addLast("Three");
		System.out.println(deque.removeFirst()); // One
		System.out.println(deque.removeFirst()); // Two
		// Using deque as a stack (LIFO)
		deque.push("A");
		deque.push("B");
		deque.push("C");

		System.out.println(deque.pop()); // C
		System.out.println(deque.pop()); // B

	}

}
