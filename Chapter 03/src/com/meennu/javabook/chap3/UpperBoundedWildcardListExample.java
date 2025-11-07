package com.meennu.javabook.chap3;

import java.util.List;

public class UpperBoundedWildcardListExample {
	public static double sumOfNumbers(List<? extends Number> upperBoundedNumberList) {
		double sum = 0;
		for (Number num : upperBoundedNumberList) {
			sum += num.doubleValue(); // Safe because Number has doubleValue()
		}
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> intList = List.of(1, 2, 3);
		List<Double> doubleList = List.of(1.5, 2.5, 3.5);

		System.out.println(sumOfNumbers(intList)); // Output: 6.0
		System.out.println(sumOfNumbers(doubleList)); // Output: 7.5
	}
}
