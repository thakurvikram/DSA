package dsa.learning.stack;

public class LinkedStack<T> {

	private Node<T> top;
	
	public LinkedStack() {
		top = null;
	}

	public void push(T data) {
		if (top == null) {
			top = new Node<T>(data);
		} else {
			Node<T> current = new Node<T>(data);
			current.next = top;
			top = current;
		}
	}

	public Node<T> pop() {
		Node<T> first = top;
		top = top.next;
		return first;
	}

	public boolean isEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}

	public void traverse() {
		if (top == null)
			return;
		Node<T> current = top;
		while (current.next != null) {
			System.out.print(current.data);
			current = current.next;
		}
		System.out.print(current.data);
		System.out.println();
	}

}

class Node<T> {
	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
		next = null;
	}
}
