package com.meennu.javabook.chap3;

import java.util.Map;
import java.util.HashMap;

public class GenericMapExample {
	public static void main(String[] args) {
		Map<Integer, String> genericEmployeeMap = new HashMap<>();
		genericEmployeeMap.put(101, "Employee1");
		genericEmployeeMap.put(102, "Employee2");
		genericEmployeeMap.put(103, "Employee3");

		for (Map.Entry<Integer, String> entry : genericEmployeeMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
		}
	}
}