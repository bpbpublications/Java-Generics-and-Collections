package com.meennu.javabook.chap11.practicalexamples;

import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
	
	public static void main(String args[]) {
		List<String> products = List.of(
			    "Notebook",
			    "Pen",
			    "Pencil (Out of Stock)",
			    "Marker",
			    "Eraser (Out of Stock)"
			);

			List<String> availableProducts = products.stream()
			    .filter(p -> !p.contains("(Out of Stock)"))
			    .collect(Collectors.toList());

			System.out.println(availableProducts); // [Notebook, Pen, Marker]

	}

}
