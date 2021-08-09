package learning.dsa;

import dsa.learning.linkedlist.LinkedListNode;
import dsa.learning.linkedlist.ReverseLinkedList;
import dsa.learning.linkedlist.ReverseLinkedList_Recursion;

public class App {

	public static void main(String[] a) {
		ReverseLinkedList s = new ReverseLinkedList();
		LinkedListNode head = new LinkedListNode(1,
				new LinkedListNode(2, new LinkedListNode(3, new LinkedListNode(4, new LinkedListNode(5, null)))));
		//LinkedListNode reverseList = s.reverseList(head);
		//System.out.println(reverseList);

		ReverseLinkedList_Recursion rr = new ReverseLinkedList_Recursion();
		System.out.println(rr.reverseList(head));
		
		int x=5, y=10;
		y/=x;
		
	}
}
