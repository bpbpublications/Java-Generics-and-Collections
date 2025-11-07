package com.meennu.javabook.chap5;

public class LinkedListDemo {
	public static void main(String[] args) {
		CustomLinkedList<Integer> list = new CustomLinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.display(); // Output: 10 => 20 => 30 => 40 => null

		list.remove(20);
		list.display(); // Output: 10 => 30 => 40 => null

		System.out.println("Element at index 1: " + list.get(1)); // Output: 30
	}
}
