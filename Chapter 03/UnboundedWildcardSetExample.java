package com.meennu.javabook.chap3;

import java.util.Set;

public class UnboundedWildcardSetExample {
	public static void printSet(Set<?> unboundedSet) {
		for (Object element : unboundedSet) {
			System.out.println(element);
		}
	}
}
