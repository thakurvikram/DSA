package dsa.learning.linkedlist;

public class ReverseLinkedList {

	public LinkedListNode reverseList(LinkedListNode head) {

		LinkedListNode current = null;
		LinkedListNode next = null;
		LinkedListNode prev = null;

		while (head.next != null) {
			current = head;
			next = head.next;
			current.next = prev;
			prev = head;
			head = next;
		}

		current = head;
		current.next = prev;

		return head;

	}
}
