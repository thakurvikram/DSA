package dsa.learning.stack;

public class Application {

	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push(1);
		stack.traverse();
		stack.push(2);
		stack.traverse();
		stack.push(3);
		stack.traverse();
		stack.push(4);
		stack.traverse();
		stack.pop();
		stack.traverse();
		stack.push(5);
		stack.traverse();
		
		LinkedStack<Integer> ls = new LinkedStack<Integer>();
		ls.push(1);
		ls.traverse();
		ls.push(2);
		ls.traverse();
		ls.push(3);
		ls.traverse();
		ls.push(4);
		ls.traverse();
		ls.pop();
		ls.traverse();
		ls.push(5);
		ls.traverse();
	}

}
