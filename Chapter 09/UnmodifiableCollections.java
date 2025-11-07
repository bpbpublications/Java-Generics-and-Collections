package com.meennu.javabook.chap9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollections {
	public static void main(String[] args) {
		List<String> departments = new ArrayList<>();
		departments.add("HR");
		departments.add("Finance");
		departments.add("IT");

		List<String> unmodifiableDepartments = Collections.unmodifiableList(departments);
		unmodifiableDepartments.add("Marketing"); 
	}
}
