package com.meennu.javabook.chap1;

public class GenericBox<T> {
	
	private T item;
	
    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    
    public static void main(String args[]) {
    	GenericBox<Integer> intBox = new GenericBox<>();
    	intBox.setItem(123);
    	
    	GenericBox<String> strBox = new GenericBox<>();
    	strBox.setItem("Hello");

    }
    

}
