package com.meennu.javabook.chap8;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowExample {
	
	public static void main(String[] args) {
		Deque<Integer> window = new ArrayDeque<>();

		for (int i = 1; i <= 6; i++) {
		    if (window.size() == 3) {
		        window.removeFirst();
		    }
		    window.addLast(i);
		    System.out.println(window);
		}

	}

}
