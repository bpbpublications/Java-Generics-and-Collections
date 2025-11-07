package com.meennu.javabook.chap11.practicalexamples;

import java.util.ArrayList;
import java.util.List;

public class Example3 {	

	public static void main(String args[]) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Michael", 88));
		students.add(new Student("Ariel", 95));
		students.add(new Student("Rox", 76));

		students.sort((s1, s2) -> Integer.compare(s2.marks, s1.marks));

		System.out.println(students); 
	}

}