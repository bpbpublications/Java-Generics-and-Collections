package com.meennu.javabook.chap9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShufflingElements {
	
	public static void main(String[] args) {
		List<Integer> questionIds = Arrays.asList(101, 102, 103, 104, 105);
		Collections.shuffle(questionIds);
		System.out.println(questionIds);
	}

}
