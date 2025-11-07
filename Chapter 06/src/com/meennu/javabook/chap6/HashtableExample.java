package com.meennu.javabook.chap6;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable with default capacity and load factor
        Hashtable<String, Integer> studentMarks = new Hashtable<>();

        // Adding key-value pairs
        studentMarks.put("Ray", 85);
        studentMarks.put("Sara", 92);
        studentMarks.put("Adam", 76);
        studentMarks.put("Grace", 88);

        // Retrieving a value
        System.out.println("Sara's marks: " + studentMarks.get("Sara"));

        // Iterating through Hashtable
        for (String name : studentMarks.keySet()) {
            System.out.println(name + " scored " + studentMarks.get(name));
        }

        // Removing a key
        studentMarks.remove("Adam");

        System.out.println("Updated Hashtable: " + studentMarks);
    }
}
