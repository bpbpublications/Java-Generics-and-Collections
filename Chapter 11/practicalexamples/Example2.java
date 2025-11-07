package com.meennu.javabook.chap11.practicalexamples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example2 {
	public static void main(String args[]) {
		record Employee(String name, String department) {}

		List<Employee> employees = List.of(
		    new Employee("Alex", "HR"),
		    new Employee("Rocky", "Engineering"),
		    new Employee("Mike", "HR"),
		    new Employee("Aron", "Engineering")
		);

		Map<String, List<Employee>> groupedByDept = employees.stream()
		    .collect(Collectors.groupingBy(Employee::department));

		System.out.println(groupedByDept);

	}

}
