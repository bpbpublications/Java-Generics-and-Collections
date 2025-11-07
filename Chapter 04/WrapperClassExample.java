package com.meennu.javabook.chap4;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassExample {
    public static void main(String[] args) {
        // Creating a list of integers (using the Integer wrapper class)
        List<Integer> numberList = new ArrayList<>();

        // Autoboxing: Primitive int to Integer object
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);

        // Accessing elements with unboxing
        int firstNumber = numberList.get(0); // Unboxing: Integer to int

        System.out.println("List of numbers: " + numberList);
        //Output: List of numbers: [10, 20, 30]
        System.out.println("First number: " + firstNumber);
        //Output: First number: 10
    }
}
