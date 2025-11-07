package com.meennu.javabook.chap8;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("Apple");
		queue.add("Banana");
		queue.add("Cherry");

		System.out.println(queue.poll()); 
		System.out.println(queue.peek()); // Banana
	}

}
