package com.meennu.javabook.chap4;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveExample {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Ryan");
        names.add("Roger");
        names.add("Royce");
        
        System.out.println(names); // Output: [Ryan, Roger, Royce]

        names.remove("Ryan");

        System.out.println(names); // Output: [Roger, Royce]
        
        boolean result = names.remove("Roy");
        System.out.println(result); //false     
        System.out.println(names); // Output: [Roger, Royce]
        
    }
}
