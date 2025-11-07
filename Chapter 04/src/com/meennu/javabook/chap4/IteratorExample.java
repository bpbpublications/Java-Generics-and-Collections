package com.meennu.javabook.chap4;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ryan");
        names.add("Roger");
        names.add("Royce");

        Iterator<String> iterator = names.iterator();

        System.out.println("Iterating through the list:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);

            // Removing an element during iteration
            if (name.equals("Ryan")) {
                iterator.remove();
            }
        }

        System.out.println("\nList after removal: " + names);
    }
}

