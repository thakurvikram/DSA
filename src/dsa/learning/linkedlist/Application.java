package dsa.learning.linkedlist;

public class Application {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insert(1);
		list.insert(2);
		//list.insert(12);
		//list.insert(22);
		//list.insert(23);
		Node<Integer> insert = list.insert(3);
		System.out.println(insert);
		
		//System.out.println(list.insert(15, 2));
		
		//System.out.println(list.reverse());
		
		//list.reverse1();
		//list.printForward();
		list.printReverse();
	}

}
