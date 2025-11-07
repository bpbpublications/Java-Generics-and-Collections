package com.meennu.javabook.chap1;

public class Container<T> { // T is the type parameter
    private T product;
    public Container(T product) {
        this.product = product;
    }
    public T getProduct() {
        return product;
    }
    public void setProduct(T product){
        this.product = product;
    }
    
    public static void main(String[] args) {
    	Container<Integer> integerContainer = new Container<>(123); 
    	// T is replaced with Integer
    	int intValue = integerContainer.getProduct(); // No casting needed

    	Container<String> stringContainer = new Container<>("Hello"); 
    	// T is replaced with String
    	String textValue = stringContainer.getProduct(); // No casting needed

    	Container<Double> doubleContainer = new Container<>(3.14);
    	double piValue = doubleContainer.getProduct();

    }
}
