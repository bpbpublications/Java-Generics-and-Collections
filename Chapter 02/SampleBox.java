package com.meennu.javabook.chap2;

class SampleBox<T extends Comparable<T>> implements Comparable<SampleBox<T>> {
	private T value;

	public SampleBox(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	@Override
	public int compareTo(SampleBox<T> other) {
		return this.value.compareTo(other.value);
	}

	public static void main(String[] args) {
		SampleBox<Integer> box1 = new SampleBox<>(10);
		SampleBox<Integer> box2 = new SampleBox<>(20);
		int comparison = box1.compareTo(box2); // Comparing Integer values

		SampleBox<String> box3 = new SampleBox<>("apple");
		SampleBox<String> box4 = new SampleBox<>("banana");
		int stringComparison = box3.compareTo(box4); // Comparing String values

		System.out.println("Integer comparison: " + comparison);
		System.out.println("String comparison: " + stringComparison);
	}
}