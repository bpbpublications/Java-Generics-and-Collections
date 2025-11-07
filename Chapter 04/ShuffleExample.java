package com.meennu.javabook.chap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ryan");
        names.add("Roger");
        names.add("Royce");

        Collections.shuffle(names);
        System.out.println(names); // Output: Random order of [Ravi, Raju, Rohit]
    }
}
