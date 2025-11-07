package com.meennu.javabook.chap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedExample {
    public static void main(String[] args) {
        List<String> names = Collections.synchronizedList(new ArrayList<>());

        names.add("Ryan");
        names.add("Roger");
        names.add("Royce");

        // Synchronize during iteration
        synchronized (names) {
            for (String name : names) {
                System.out.println(name);
            }
        }
        /*Output: 
        Ryan
        Roger
        Royce*/

    }
}
