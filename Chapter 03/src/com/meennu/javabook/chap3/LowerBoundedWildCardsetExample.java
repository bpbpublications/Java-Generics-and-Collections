package com.meennu.javabook.chap3;

import java.util.Set;

public class LowerBoundedWildCardsetExample {

	public static void addEmployees(Set<? super Manager> employeeSet) {
		employeeSet.add(new Manager("Manager1"));
		employeeSet.add(new Manager("Manager2"));
	}

}
