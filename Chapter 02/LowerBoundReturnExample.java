package com.meennu.javabook.chap2;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundReturnExample {

	public static List<? super Integer> getNumberList() {
        List<Number> numbers = new ArrayList<>();
        numbers.add(10);       
        numbers.add(20.5);      
        return numbers;        
    }

    public static void main(String[] args) {
        List<? super Integer> list = getNumberList();
        
        list.add(30); 
        
        // Cannot do this because type is unknown beyond Integer's superclasses
        // Integer num = list.get(0);  // Compilation error

        // However, we can retrieve elements as Object
        Object obj = list.get(0); 
    }
}
