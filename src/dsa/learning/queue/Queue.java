package dsa.learning.queue;

public class Queue<T> {

	Node<T> front, rear;

	public Queue() {
		front = null;
		rear = null;
	}

	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		if (front == null && rear == null) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}

	public void pop() {
		if (front == null && rear == null) {
			System.out.println("Queue is empty");
		} else {
			Node<T> temp = front;
			front = front.next;
			temp = null;
		}
	}

	public void traverse() {
		if (front == null)
			return;
		Node<T> current = front;
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
