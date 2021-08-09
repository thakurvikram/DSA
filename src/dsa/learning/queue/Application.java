package dsa.learning.queue;

public class Application {

	public static void main(String[] args) {

		Queue<Integer> q = new Queue<Integer>();
		
		q.push(1);
		q.traverse();
		q.push(2);
		q.traverse();
		q.push(3);
		q.traverse();
		q.pop();
		q.traverse();
	}

}
