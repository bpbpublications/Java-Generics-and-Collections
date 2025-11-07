package com.meennu.javabook.chap5;

class CustomArrayList {
    private int[] data;
    private int size;
    private int capacity;

    public CustomArrayList(int initialCapacity) {
        this.capacity = initialCapacity;
        this.data = new int[capacity];
        this.size = 0;
    }

    public void add(int element) {
        if (size == capacity) {
            expandCapacity();
        }
        data[size++] = element;
    }

    private void expandCapacity() {
        capacity *= 2; // Double the capacity
        int[] newData = new int[capacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return data[index];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList(2);
        list.add(10);
        list.add(20);
        list.add(30); // Triggers capacity expansion

        System.out.println("Element at index 1: " + list.get(1)); // Output: 20
        System.out.println("List size: " + list.size()); // Output: 3
    }
}