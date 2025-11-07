package com.meennu.javabook.chap1;

public class GenericMethodExample {
	public static <T> void printArrayObjects(T[] array) {
		for (T arrayObj : array) {
			System.out.println(arrayObj);
		}
	}

	public static void main(String[] args) {
		Integer[] numbers = {1, 2, 3};
		printArrayObjects(numbers);// Type inference: T is inferred as Integer

		String[] words = {"Hello", "World"}; 
		printArrayObjects(words); // Type inference: T is inferred as String 

		Character[] chars = {'a', 'b', 'c'}; 
		printArrayObjects(chars); // Type inference: T is inferred as Character 

		//Explicitly specifying the type argument (less common): 
		printArrayObjects(new Double[]{1.0, 2.0, 3.0});

	}

}
