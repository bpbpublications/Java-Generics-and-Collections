package com.meennu.javabook.chap3;

import java.util.Map;

public class UnboundedWildcardMapExample {
	
	public static void printMap(Map<?, ?> unboundedGenericMap) {
	    for (Map.Entry<?, ?> entry : unboundedGenericMap.entrySet()) {
	        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	    }
	}

}
