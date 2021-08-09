package dsa.learning.linkedlist;

public class MergeList {

	public LinkedListNode mergeTwoLists(LinkedListNode l1, LinkedListNode l2) {

		if(l1 == null && l2 == null) return null;
		if(l1 == null && l2 != null) return l2;
		if(l1 != null && l2 == null) return l1;
		
		return null;
	}
}
