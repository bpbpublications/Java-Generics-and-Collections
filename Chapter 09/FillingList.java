package com.meennu.javabook.chap9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FillingList {
	public static void main(String[] args) {
		List<String> scoreboard = new ArrayList<>(Arrays.asList("A", "B", "C"));
		Collections.fill(scoreboard, "Not Started");
		System.out.println(scoreboard);
	}
}
