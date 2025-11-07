package com.meennu.javabook.chap4;

import java.util.ArrayList;
import java.util.Collection;

public class ContainsExample {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Ryan");
        names.add("Royce");

        System.out.println(names.contains("Ryan")); // Output: true
        System.out.println(names.contains("Roger")); // Output: false
    }
}
