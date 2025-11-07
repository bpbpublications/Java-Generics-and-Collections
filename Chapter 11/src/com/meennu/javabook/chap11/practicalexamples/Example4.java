package com.meennu.javabook.chap11.practicalexamples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example4 {
	
	public static void main(String args[]) {
		List<String> productIds = List.of("P1", "P2", "P1", "P3", "P2", "P1");

		Map<String, Long> frequencyMap = productIds.stream()
		    .collect(Collectors.groupingBy(
		        id -> id,
		        Collectors.counting()
		    ));

		System.out.println(frequencyMap); // {P1=3, P2=2, P3=1}
		
	}

}
