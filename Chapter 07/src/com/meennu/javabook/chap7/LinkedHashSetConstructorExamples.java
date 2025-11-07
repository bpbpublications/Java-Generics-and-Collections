package com.meennu.javabook.chap7;

import java.util.*;

public class LinkedHashSetConstructorExamples {
    public static void main(String[] args) {
        // Using default constructor
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("Apple");
        set1.add("Banana");

        // Using initial capacity constructor
        LinkedHashSet<String> set2 = new LinkedHashSet<>(20);
        set2.add("Cherry");

        // Using initial capacity and load factor
        LinkedHashSet<String> set3 = new LinkedHashSet<>(10, 0.5f);
        set3.add("Date");

        // Using constructor with a collection
        List<String> list = Arrays.asList("Sugarcane", "Fig", "Grape");
        LinkedHashSet<String> set4 = new LinkedHashSet<>(list);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Set3: " + set3);
        System.out.println("Set4: " + set4);
    }
}
