package dsa.learning.linkedlist;

public class LinkedList<T> {

	private Node<T> head = null;

	public Node<T> insert(T value) {
		if (head == null)
			head = new Node<T>(value);
		else {
			Node<T> current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node<T>(value);
		}
		return head;
	}

	public Node<T> insert(int value, int position) {
		if (head == null)
			return null;
		Node<T> current = head;
		for (int i = 0; i < position - 2; i++) {
			current = current.next;
		}
		Node<T> temp = new Node(value);
		temp.next = current.next;
		current.next = temp;
		return head;
	}

	public Node<T> reverse() {
		if (head == null)
			return head;
		Node<T> current, next, prev = null;
		current = head;
		while (current.next != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		next = current.next;
		current.next = prev;
		prev = current;
		head = current;
		return head;
	}

	public void reverse1() {

		reverseRecursion(head);
	}

	private void reverseRecursion(Node<T> node) {

		if (node == null || node.next == null) {
			head = node;
			return;
		} else {
			reverseRecursion(node.next);
			Node<T> next = node.next;
			next.next = node;
			node.next = null;
		}
	}

	public void printForward() {
		traverseForward(head);
	}

	public void printReverse() {
		traverseReverse(head);
	}

	private void traverseForward(Node<T> node) {
		if (node == null || node.next == null)
			return;
		else {
			System.out.print(node.value + "->");
			traverseForward(node.next);
		}
	}

	private void traverseReverse(Node<T> node) {
		if (node.next == null) {
			System.out.print(node.value+"->");
			return;
		} else {
			traverseReverse(node.next);
			System.out.print(node.value + "->");
		}
	}
}

class Node<T> {
	T value;
	Node<T> next;

	public Node(T value) {
		this.value = value;
		this.next = null;
	}

	@Override
	public String toString() {
		return value + "->" + next;
	}
}