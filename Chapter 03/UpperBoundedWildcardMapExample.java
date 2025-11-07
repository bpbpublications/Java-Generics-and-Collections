package com.meennu.javabook.chap3;

import java.util.HashMap;
import java.util.Map;

public class UpperBoundedWildcardMapExample {
	public static void printEmployees(Map<? extends Number, ? extends Employee> employeeMap) {
		for (Map.Entry<? extends Number, ? extends Employee> entry : employeeMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue().empName);
		}
	}

	public static void main(String[] args) {
		Map<Integer, Employee> employees = new HashMap<>();
		employees.put(1, new Employee("Employee1", 1));
		employees.put(2, new ProgramManager("Employee2", 2));

		printEmployees(employees);
	}
}
