package dsa.learning.stack;

public class Stack {

	private int MAX = 100;
	private int[] a = new int[MAX];
	private int top;

	Stack() {
		top = -1;
	}

	public void push(int data) {
		if (top == MAX) {
			System.out.println("Stack overflow");
			return;
		}
		a[++top] = data;
	}

	public int pop() {
		if (this.isEmpty()) {
			System.out.println("Stack is empty");
		}
		int data = a[top];
		top--;
		return data;
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public void traverse() {
		for(int i = 0 ; i <=top; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
