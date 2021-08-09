package dsa.learning.tree;

public class BinarySearchTreeSolution {

	public static void main(String[] args) {

		BinayTree bt = new BinayTree();
		BinayTree.Node root= bt.root;
		root = bt.insert(root, 8);
		root = bt.insert(root, 3);
		root = bt.insert(root, 10);
		root = bt.insert(root, 1);
		root = bt.insert(root, 6);
		root = bt.insert(root, 14);
		root = bt.insert(root, 4);
		root = bt.insert(root, 7);
		root = bt.insert(root, 13);
		//To see image of the inserted tree go to https://en.wikipedia.org/wiki/Binary_search_tree
		
		//bt.traverseInOrder(root);
		//System.out.println();
		//System.out.println(bt.search(root, 4));
		//System.out.println("Max is "+bt.max(root));
		//System.out.println("Min is "+bt.min(root));
		
		//System.out.println("Height is "+bt.height(root));
		
		//bt.traverseInLevelOrder(root);
		/*
		 * System.out.println(); System.out.print("PreOrder -> ");
		 * bt.traversePreOrder(root);
		 * 
		 * System.out.println(); System.out.print("InOrder -> ");
		 * bt.traverseInOrder(root);
		 * 
		 * System.out.println(); System.out.print("PostOrder -> ");
		 * bt.traversePostOrder(root);
		 * 
		 * System.out.println();
		 * System.out.println("Is BST "+bt.isBinarySearchTree(root));
		 * 
		 * System.out.println();
		 * System.out.println("Is BST "+bt.isBinarySearchTreeOptimized(root));
		 */
		
		bt.traverseInOrder(root);

		System.out.println();
		
		bt.deleteNode(root, 1);
		bt.traverseInOrder(root);
		
		
	}

}
