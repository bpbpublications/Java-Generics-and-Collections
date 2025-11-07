package com.meennu.javabook.chap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ryan");
        names.add("Zane");
        names.add("Aiden");

        Collections.sort(names);
        System.out.println(names); // Output: [Aakash, Ravi, Zain]
    }
}
