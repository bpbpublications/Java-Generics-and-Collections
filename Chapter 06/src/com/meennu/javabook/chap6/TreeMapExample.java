package com.meennu.javabook.chap6;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> studentMap = new TreeMap<>();

        // Add entries to the TreeMap
        studentMap.put(102, "Aaron");
        studentMap.put(101, "Bella");
        studentMap.put(103, "Chris");

        // TreeMap maintains ascending order of keys
        System.out.println("Initial TreeMap: " + studentMap);

        // Get a value by key
        System.out.println("Student with ID 101: " + studentMap.get(101));

        // Update a value
        studentMap.put(101, "Brian");
        System.out.println("After updating ID 101: " + studentMap);

        // Remove an entry
        studentMap.remove(102);
        System.out.println("After removing ID 102: " + studentMap);

        // Iterate over the TreeMap
        System.out.println("Iterating TreeMap:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Other useful TreeMap operations
        System.out.println("First Entry: " + studentMap.firstEntry());
        System.out.println("Last Key: " + studentMap.lastKey());
        System.out.println("Ceiling Entry for 102: " + studentMap.ceilingEntry(102));
        System.out.println("Lower Key than 103: " + studentMap.lowerKey(103));
    }
}