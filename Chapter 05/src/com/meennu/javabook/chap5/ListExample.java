package com.meennu.javabook.chap5;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Creating a List of student names
        List<String> studentNames = new ArrayList<>();

        // Adding elements to the List
        studentNames.add("Ryan");
        studentNames.add("Roger");
        studentNames.add("Royce");

        // Accessing elements using index
        System.out.println("First Student: " + studentNames.get(0));

        // Iterating through the List
        System.out.println("All Students:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        // Checking if an element exists
        System.out.println("Is Ryan in the list? " + studentNames.contains("Ryan"));

        // Removing an element
        studentNames.remove("Roger");
        System.out.println("After removing Roger: " + studentNames);
    }
}
