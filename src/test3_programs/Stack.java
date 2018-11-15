package test3_programs;

public class Stack {
	Node top;

	Stack(){   // Optional 
		top = null;  // null initialization
		// Here to show the top always start as null
	}

	public boolean isEmpty() {
		return(top == null);
	}

	public void peek() {
		if(isEmpty())
			System.out.println("There is nothing to peek");
		else {
			System.out.println("Peeked the top node with id = " + top.id);
		}
	}

	public void push(int id) {
		Node node = new Node(id);

		if (top == null) {
			top = node;
			System.out.println("Pushed the node with id = " + node.id);

		}
		else {
			node.next = top;
			top = node;
			System.out.println("Pushed the node with id = " + node.id);

		}	
	}

	public void pop() {
		if (top == null) {
			System.out.println("There is no node to delete" );
			return;
		}
		else {
			int id = top.id;
			System.out.println("Poped the node with id = " + id );
			top = top.next;
		}
	}

	public void displayAllNodes(){

		Node thisNode = top;

		while(thisNode != null){
			thisNode.displayANode();
			System.out.println("Next Node: " + thisNode.next);
			thisNode = thisNode.next;
			System.out.println();

		}

	}


}  // end of the Stack Class

