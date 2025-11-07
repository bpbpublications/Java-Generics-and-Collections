package com.meennu.javabook.chap1;

public class CommonBox<T> {
	private T commonItem;

	public void setCommonItem(T item) {
		this.commonItem = item;
	}

	public T getCommonItem() {
		return commonItem;
	}

	public static void main(String[] args) {
		CommonBox<Integer> intBox = new CommonBox<>();
		intBox.setCommonItem(123);

		CommonBox<String> strBox = new CommonBox<>();
		strBox.setCommonItem("Hello");

	}
}
