package dsa.learning.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinayTree {

	// root node
	Node root;

	class Node {
		int value;
		Node left, right;

		Node(int value) {
			this.value = value;
			left = right = null;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
		}
	}

	public BinayTree() {
		super();
	}

	public Node insert(Node root, int value) {
		if (root == null) {
			root = new Node(value);
		} else if (value <= root.value) {
			root.left = insert(root.left, value);
		} else
			root.right = insert(root.right, value);

		return root;
	}

	public Node search(Node root, int value) {
		if (root == null)
			return null;
		if (value == root.value)
			return root;
		else if (value <= root.value)
			return search(root.left, value);
		else if (value > root.value)
			return search(root.right, value);
		return root;
	}

	public int max(Node root) {
		if (root == null || root.right == null)
			return root.value;
		return max(root.right);
	}

	public int min(Node root) {
		if (root == null || root.left == null)
			return root.value;
		return min(root.left);
	}

	public int height(Node root) {
		if (root == null)
			// to count edges return -1 or return 0 to count nodes
			return -1;
		return Math.max(height(root.left), height(root.right)) + 1;
	}

	/**
	 * Traverse the tree in level order (BFS)
	 * 
	 * @param root
	 */
	public void traverseInLevelOrder(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			Node current = q.peek();
			System.out.print(current.value + " -> ");
			if (current.left != null)
				q.add(current.left);
			if (current.right != null)
				q.add(current.right);
			q.remove();
		}
	}

	/**
	 * <root><left><right>
	 * 
	 * @param root
	 */
	public void traversePreOrder(Node root) {
		if (root == null)
			return;

		System.out.print(root.value + " -> ");
		traversePreOrder(root.left);
		traversePreOrder(root.right);
	}

	/**
	 * <left><root><right>
	 * 
	 * @param root
	 */
	public void traverseInOrder(Node root) {
		if (root == null)
			return;

		traverseInOrder(root.left);
		System.out.print(root.value + " -> ");
		traverseInOrder(root.right);
	}

	/**
	 * <left><right><root>
	 * 
	 * @param root
	 */
	public void traversePostOrder(Node root) {
		if (root == null)
			return;

		traversePostOrder(root.left);
		traversePostOrder(root.right);
		System.out.print(root.value + " -> ");
	}

	/**
	 * complexity - O(n^2)
	 * 
	 * @param root
	 * @return
	 */
	public boolean isBinarySearchTree(Node root) {
		if (root == null)
			return true;

		if (isSubTreeLesser(root.left, root.value) && isSubTreeGreater(root.right, root.value)
				&& isBinarySearchTree(root.left) && isBinarySearchTree(root.right))
			return true;
		else
			return false;
	}

	private boolean isSubTreeLesser(Node root, int value) {
		if (root == null)
			return true;

		if (root.value <= value && isSubTreeLesser(root.left, value) && isSubTreeLesser(root.right, value))
			return true;
		else
			return false;
	}

	private boolean isSubTreeGreater(Node root, int value) {
		if (root == null)
			return true;

		if (root.value > value && isSubTreeGreater(root.left, value) && isSubTreeGreater(root.right, value))
			return true;
		else
			return false;
	}

	/**
	 * Complexity O(n)
	 * 
	 * @param root
	 * @return
	 */
	public boolean isBinarySearchTreeOptimized(Node root) {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBST(Node root, int min, int max) {
		if (root == null)
			return true;

		if ((min <= root.value && root.value < max) && isBinarySearchTree(root.left) && isBinarySearchTree(root.right))
			return true;
		else
			return false;
	}

	public Node deleteNode(Node root, int value) {
		if (root == null)
			return root;
		else if (value < root.value) {
			root.left = deleteNode(root.left, value);
		} else if (value > root.value) {
			root.right = deleteNode(root.right, value);
		}
		// This is the node to be deleted
		else {
			// case 1: no sub nodes
			if (root.left == null && root.right == null) {
				root = null;
			}
			// case 2: only one sub node
			else if (root.left == null && root.right != null) {
				root = root.right;
			} else if (root.right == null && root.left != null) {
				root = root.left;
			}
			// Case 3: Two sub node
			else {
				int min = min(root.right);
				root.value = min;
				root = deleteNode(root.right, min);
			}
		}
		return root;
	}
}
