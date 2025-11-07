package com.meennu.javabook.chap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedCollectionExample {
	public static void main(String[] args) {
        List<String> names = Collections.checkedList(new ArrayList<>(), String.class);
        names.add("Ryan");
        // Trying to add a wrong type will cause a runtime error
        // names.add(100); // This will throw ClassCastException
        System.out.println("Checked List: " + names);
        //Output: Checked List: [Ryan]
    }


}
