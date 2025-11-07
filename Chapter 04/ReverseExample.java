package com.meennu.javabook.chap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ryan");
        names.add("Roger");
        names.add("Royce");
        
        System.out.println(names); // Output: [Ryan, Roger, Royce]

        Collections.reverse(names);
        System.out.println(names); // Output: [Royce, Roger, Ryan]
    }
}
