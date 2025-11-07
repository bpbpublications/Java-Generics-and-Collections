package com.meennu.javabook.chap1;

public class TemplateClass<T> {
	private T templateValue;

	public void setTemplateValue(T value) {
		this.templateValue = value;
	}

	public T getTemplateValue() {
		return templateValue;
	}

	public static void main(String[] args) {
		TemplateClass<String> stringInstance = new TemplateClass<>();
		stringInstance.setTemplateValue("Hello, Generics!");
		System.out.println(stringInstance.getTemplateValue());
	}
}
