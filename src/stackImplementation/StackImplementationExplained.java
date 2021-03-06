package stackImplementation;

// Please watch: https://www.youtube.com/watch?v=wjI1WNcIntg

class Node {
	int id;
	String name;
	Node next; 
	public Node(int Id, String name){
		this.id = Id;
		this.name = name;
	}

	public void displayANode(){
		System.out.println("id: " + id + " name:" + name );
	}
	@Override
	public String toString(){   // Required
		return name;
	}
}  // End of the Node class

class Stack {
	Node top;

	Stack(){   // Optional 
		top = null;  // null initialization
		// Here to show the top always start as null
	}

	public boolean isEmpty() {
		return (top == null);
	}

	public void peek() {
		if(isEmpty()== true)
			System.out.println("There is nothing to peek");
		else {
			System.out.println("The top node's id is : " + top.id);
			System.out.println("The top node's name is : " + top.name);
		}
	}

	public void push(int id, String name) {

		Node node = new Node(id, name);

		//	if (top == null) // 
		if (isEmpty()== true)
		{
			top = node;
		}
		else {
			node.next = top;
			top = node;		
		}	
	}

	public void pop() {
		if (this.top == null) // if (isEmpty()== true)
		{
			System.out.println("There is no node to delete" );
			return;
		}
		else {
			int id = top.id;
			String name = top.name;
			System.out.println("Poped the node with Id: " + id + " and Name:" + name );
			this.top = this.top.next;
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


public class StackImplementationExplained {

	public static void main(String[] args) {

		System.out.println("Stack Implementation Explained ....... ");

		Stack mys = new Stack();

		mys.push(1, "AA");
		
		mys.push(2, "BB");

		mys.push(3, "CC");
		mys.push(4, "DD");
		mys.push(5, "EE");
		mys.pop();
		mys.peek();
		
		
		//mys.displayAllNodes();
		
		mys.pop();
		mys.pop();
		mys.pop();
		mys.pop();
		
		mys.pop();
		mys.pop();
		mys.pop();
		mys.pop();
		mys.pop();
		mys.pop();
		mys.peek();

		mys.displayAllNodes();
		
	}

}
