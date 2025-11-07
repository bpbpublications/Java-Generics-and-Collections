package com.meennu.javabook.chap3;

import java.util.Map;
import java.util.HashMap;

public class LowerBoundedWildcardMapExample {
	public static void addEmployees(Map<? super Integer, ? super Employee> employeeMap) {
		employeeMap.put(201, new Employee("Employee1", 201));
		employeeMap.put(202, new ProgramManager("Employee2", 202));
	}

	public static void main(String[] args) {
		Map<Number, Object> employees = new HashMap<>();
		addEmployees(employees);
		for (Map.Entry<Number, Object> entry : employees.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}

