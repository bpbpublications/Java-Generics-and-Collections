package com.meennu.javabook.chap9;

import java.util.Arrays;

public class FillingArray {
	public static void main(String[] args) {
		int[] data = new int[5];
		Arrays.fill(data, 10);
		System.out.println(Arrays.toString(data));
	}
}
