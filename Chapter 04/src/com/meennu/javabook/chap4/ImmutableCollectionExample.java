package com.meennu.javabook.chap4;

import java.util.List;

public class ImmutableCollectionExample {
    public static void main(String[] args) {
        List<String> names = List.of("Ryan", "Roger", "Royce");
        System.out.println("Immutable List: " + names);
        //Output: Immutable List: [Ryan, Roger, Royce]
        // Trying to add a wrong type will cause a runtime error
        //names.add("Zane"); // This will throw UnsupportedOperationException
    }
}
