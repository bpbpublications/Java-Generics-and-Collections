package com.meennu.javabook.chap2;

public class Product implements Searchable {

	@Override
	public boolean matches(String keyword) {
		return false;
	}

}
