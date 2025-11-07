package com.meennu.javabook.chap2;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundsConsumingElements {
	
	public static void main(String[] args) {
		List<Object> objectList = new ArrayList<>();
	    addElements(objectList, new String("hello")); 
	    addElements(objectList, new Integer(10)); 
	    
	    List<String> stringList = new ArrayList<>();
	    // addElements(stringList, new Object());
	    
	    List<Integer> intList = new ArrayList<>();
	    // addElements(intList, new Number()); 
	    
	    
	    
	}
	
	public static <T> void addElements(List<? super T> list, T element) {
	    list.add(element);
	}

}
