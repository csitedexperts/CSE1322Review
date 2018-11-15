package bst;
// Source:  https://www.baeldung.com/java-binary-tree
// https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/

public class ImplementBST{

	public static void main(String[] args) {
		System.out.println("Implementing a BST");
		BST bst = new BST(); 

		/* Let's create a BST as follows: 
		              40 
		             /  \ 
		           20    60 
		          /  \   /  \ 
		        10   30  50  70 

		 */

		bst.insert(40); 
		bst.insert(20); 
		bst.insert(10); 
		bst.insert(30); 
		bst.insert(60); 
		bst.insert(50); 
		bst.insert(70); 
		
		System.out.println("The in-order traversal of the BST");
		bst.inorderTraverse(); 
		System.out.println();
		
		System.out.println("The pre-order traversal of the BST");
		bst.preorderTraverse(); 
		System.out.println();
		
		System.out.println("The post-order traversal of the BST");
		bst.postorderTraverse(); 
	
	/*	System.out.println();
		System.out.println("After deleting the following data node");
		bst.delete(50);
		System.out.println("The in-order traversal of the BST");
		bst.inorderTraverse(); 
		System.out.println();*/
		
	} 
} 



/* Class containing left and right child of current node and data value*/
class Node { 
	int data; 
	Node left, right; 

	public Node(int data) { 
		this.data = data; 
		left = right = null; 
	} 
} 


class BST {

	// Root of BST 
	Node root; 

	// Constructor 
	BST() {  
		root = null;  
	} 

	public boolean isEmpty() {
		return root == null;
	}

	// This method mainly calls insertRec() 
	void insert(int data) { 
		root = insertRec(root, data); 
	} 

	/* A recursive function to insert a new data in the BST */
	Node insertRec(Node root, int data) { 

		/* If the tree is empty, return a new node */
		if (root == null) { 
			root = new Node(data); 
			return root; 
		} 

		/* Otherwise, recur down the tree */
		if (data < root.data) 
			root.left = insertRec(root.left, data); 
		else if (data > root.data) 
			root.right = insertRec(root.right, data); 

		/* return the (unchanged) node pointer */
		return root; 
	} 

	/*	Searching in BST: 

	Depth-first search is a type of traversal that goes deep as much as possible in every child before exploring the next sibling.

	There are several ways to perform a depth-first search: in-order, pre-order and post-order.

	 */	
	// This method mainly calls InorderRec() 
	void inorderTraverse()  { 
		traverseInOrder(root); 
	} 

	/*
	The in-order traversal consists of first visiting the left sub-tree, then the root node, and finally the right sub-tree:
	 */		

	// A utility function to do inorder traversal of BST 
	void traverseInOrder(Node root) { 
		if (root != null) { 
			traverseInOrder(root.left); 
			System.out.print(root.data + " "); 
			traverseInOrder(root.right); 
		} 
	} 

	// This method mainly calls PreorderRec() 
	void preorderTraverse()  { 
		traversePreOrder(root); 
	} 

	/*
	Pre-order traversal visits first the root node, then the left subtree, and finally the right subtree:
	 */	

	public void traversePreOrder(Node node) {
		if (node != null) {
			System.out.print(" " + node.data);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}

	// This method mainly calls PostorderRec() 
	void postorderTraverse()  { 
		traversePostOrder(root); 
	} 

	/*
    Post-order traversal visits the left subtree, the right subtree, and the root node at the end:

	 */
	public void traversePostOrder(Node node) {
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.data);
		}
	}
	
	// This method deletes the current node with the given data
	public void delete(int data) {
	    root = deleteRecursive(root, data);
	}
	
	private Node deleteRecursive(Node current, int data) {
	    if (current == null) {
	        return null;
	    }
	 
	    if (data == current.data) {
	        // Node to delete found
	        // ... code to delete the node will go here
	    } 
	    if (data < current.data) {
	        current.left = deleteRecursive(current.left, data);
	        return current;
	    }
	    current.right = deleteRecursive(current.right, data);
	    return current;
	}

}

