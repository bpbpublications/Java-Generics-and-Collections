package com.meennu.javabook.chap4;

import java.util.Collections;
import java.util.Set;

public class SingletonExample {
    public static void main(String[] args) {
        Set<String> singletonSet = Collections.singleton("Ryan");
        System.out.println("Singleton Set: " + singletonSet); 
        //Output: Singleton Set: [Ryan]
        // singletonSet.add("Royce");
    }
}
