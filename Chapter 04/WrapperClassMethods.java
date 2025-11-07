package com.meennu.javabook.chap4;

public class WrapperClassMethods {
    public static void main(String[] args) {
        // Parsing a string to an integer
        int number = Integer.parseInt("100");

        // Converting primitive to string
        String numStr = Integer.toString(200);

        // Comparing two wrapper objects
        Integer a = 10;
        Integer b = 20;

        int comparison = a.compareTo(b);

        System.out.println("Parsed number: " + number);
        System.out.println("Number as string: " + numStr);
        System.out.println("Comparison result: " + comparison);
        /*
         * Output: 
         *  Parsed number: 100
			Number as string: 200
			Comparison result: -1
         * */
    }
}
