package com.meennu.javabook.chap8;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
	
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();

		deque.addFirst("C");
		deque.addLast("D");
		deque.addFirst("B");
		deque.addFirst("A"); // deque = [A, B, C, D]

		System.out.println(deque);               // [A, B, C, D]
		System.out.println(deque.removeLast());  // D
		System.out.println(deque.removeFirst()); // A
		System.out.println(deque);               // [B, C]

	}

}
