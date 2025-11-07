package com.meennu.javabook.chap8;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

		queue.offer("Task1");
		queue.offer("Task2");
		queue.offer("Task3");

		System.out.println(queue.poll());
		System.out.println(queue.peek());

	}

}
