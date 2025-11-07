package com.meennu.javabook.chap9;

import java.util.Arrays;

public class CopyingArrays {
	public static void main(String[] args) {
		int[] original = {10, 20, 30};
		int[] extended = Arrays.copyOf(original, 5);
		System.out.println(Arrays.toString(extended));
	}
}
