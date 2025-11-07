package com.meennu.javabook.chap9;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Apple", "Mango", "Cherry"));
        
        // Sort in ascending order
        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits); 

        // Reverse the list
        Collections.reverse(fruits);
        System.out.println("Reversed List: " + fruits); 
    }
}

