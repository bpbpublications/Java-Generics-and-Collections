package com.meennu.javabook.chap5;

class Node<T> {
	T data;
	Node<T> next;
	Node<T> prev;

	public Node(T data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

class CustomLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;

	public CustomLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void add(T data) {
		Node<T> newNode = new Node<>(data);

		if (head == null) { // If list is empty
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}

		size++;
	}

	public boolean remove(T data) {
		if (head == null)
			return false; // Empty list
		Node<T> current = head;
		while (current != null) {
			if (current.data.equals(data)) {
				if (current == head) { // Removing head
					head = head.next;
					if (head != null)
						head.prev = null;
				} else if (current == tail) { // Removing tail
					tail = tail.prev;
					if (tail != null)
						tail.next = null;
				} else { // Removing from middle
					current.prev.next = current.next;
					current.next.prev = current.prev;
				}

				size--;
				return true;
			}
			current = current.next;
		}
		return false; // Element not found
	}

	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index);
		}

		Node<T> current;
		if (index < size / 2) { // Traverse from head
			current = head;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
		} else { // Traverse from tail
			current = tail;
			for (int i = size - 1; i > index; i--) {
				current = current.prev;
			}
		}

		return current.data;
	}

	public void display() {
		Node<T> current = head;
		while (current != null) {
			System.out.print(current.data + " => ");
			current = current.next;
		}
		System.out.println("null");
	}

}
