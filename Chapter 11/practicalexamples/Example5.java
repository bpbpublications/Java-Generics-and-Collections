package com.meennu.javabook.chap11.practicalexamples;

import java.util.List;
import java.util.stream.Collectors;

public class Example5 {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student("Aaron", List.of("Math", "Physics")),
				new Student("Rita", List.of("Biology", "Chemistry")), new Student("Kaleb", List.of("Math", "Biology")));

		List<String> allCourses = students.stream().flatMap(student -> student.getCourses().stream()).distinct()
				.collect(Collectors.toList());

		System.out.println(allCourses); // [Math, Physics, Biology, Chemistry]
	}

}
