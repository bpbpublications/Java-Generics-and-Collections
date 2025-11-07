package com.meennu.javabook.chap9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceAllExample {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Bombay", "Delhi", "Bombay", "Chennai");
		Collections.replaceAll(cities, "Bombay", "Mumbai");
		System.out.println(cities);
	}
}
