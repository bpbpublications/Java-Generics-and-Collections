package com.meennu.javabook.chap5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListExample {
	public static void main(String[] args) {
		List<Integer> list = Collections.synchronizedList(new ArrayList<>());

		list.add(10);
		list.add(20);
		list.add(30);

		synchronized (list) {
			for (Integer num : list) {
				System.out.println(num);
			}
		}
	}
}
