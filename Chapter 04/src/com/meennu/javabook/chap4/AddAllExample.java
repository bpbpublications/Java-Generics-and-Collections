package com.meennu.javabook.chap4;

import java.util.ArrayList;
import java.util.Collection;

public class AddAllExample {
	public static void main(String[] args) {
		Collection<String> firstCollection = new ArrayList<>();
		firstCollection.add("Ryan");

		Collection<String> secondCollection = new ArrayList<>();
		secondCollection.add("Roger");
		secondCollection.add("Royce");

		firstCollection.addAll(secondCollection);

		System.out.println(firstCollection); // Output: [Ryan, Roger, Royce]
		System.out.println(secondCollection); // Output: [Roger, Royce]

	}

}
