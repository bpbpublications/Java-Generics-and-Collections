package com.meennu.javabook.chap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ryan");
        names.add("Roger");
        names.add("Royce");
        System.out.println(names); // Output: [Ravi, Raju, Rohit]

        Collections.fill(names, "Unknown"); 
        System.out.println(names); // Output: [Unknown, Unknown, Unknown]
    }
}
