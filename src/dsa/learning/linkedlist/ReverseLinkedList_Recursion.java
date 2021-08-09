package dsa.learning.linkedlist;

public class ReverseLinkedList_Recursion {

	public LinkedListNode reverseList(LinkedListNode head) {

		if (head == null || head.next == null)
			return head;

		LinkedListNode p = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return p;
	}
}
