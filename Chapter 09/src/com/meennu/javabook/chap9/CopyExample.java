package com.meennu.javabook.chap9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyExample {
	public static void main(String[] args) {
		List<String> masterTeam = Arrays.asList("Neha", "Sanjay", "Ritu");
		List<String> workingCopy = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
		Collections.copy(workingCopy, masterTeam);
		System.out.println(workingCopy);
	}
}
