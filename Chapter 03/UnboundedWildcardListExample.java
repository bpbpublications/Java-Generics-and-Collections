package com.meennu.javabook.chap3;

import java.util.List;
import java.util.Arrays;

public class UnboundedWildcardListExample {
    public static void printList(List<?> unboundedList) {
        for (Object eachItem : unboundedList) {
            System.out.println(eachItem);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "C");
        List<Integer> intList = Arrays.asList(1, 2, 3);

        printList(stringList); // Works for any type
        printList(intList);
    }
}
