package com.meennu.javabook.chap3;

public class TypeEraserExample<T> {
	private T value;

	public void set(T value) {
		this.value = value;
	}

	public T get() {
		return value;
	}
}
