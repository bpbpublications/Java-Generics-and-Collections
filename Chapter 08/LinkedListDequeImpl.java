package com.meennu.javabook.chap8;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeImpl {
	
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();

		deque.addFirst("Start");
		deque.addLast("End");

		System.out.println(deque.removeFirst()); 
		System.out.println(deque.removeLast()); 

	}

}
