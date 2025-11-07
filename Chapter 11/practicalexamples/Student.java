package com.meennu.javabook.chap11.practicalexamples;

import java.util.List;

public class Student {

	private String name;
	private List<String> courses;
	int marks;

	public Student(String name, List<String> courses) {
		this.name = name;
		this.courses = courses;
	}
	
	public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

	public List<String> getCourses() {
		return courses;
	}

    public String toString() {
        return name + " (" + marks + ")";
    }


}
