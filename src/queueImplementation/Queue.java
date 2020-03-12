package queueImplementation;

public class Queue {
	Node top;
	Node tail;

	Queue(){   // Optional 
		top = null;  // null initialization
		tail = null;  // null initialization
		// Here to show the head and tail always start as null
	}

	public boolean isEmpty() {
		return (top == null);
	}

	public void peek() {
		if(isEmpty())
			System.out.println("There is nothing to peek");
		else {
			System.out.println("The top node's id is : " + top.id);
		}
	}

	public void bottom() {
		if(tail == null)
			System.out.println("There is nothing on be bottom");
		else {
			System.out.println("The bottom node's id is : " + tail.id);
		}
	}

		
	public void enQueue(int id, String name) {
		Node node = new Node(id, name);
		
		if (tail == null) {
			top = node;
			tail = node;
		}
		else {
			tail.next = node;
			tail = node;
		}
		
	}

	public void deQueue() {
		if (top == null) {
			tail = null;
			System.out.println("There is no node to delete" );
			return;
		}
		else {
			int id = top.id;
			String name = top.name;
			System.out.println("The node with Id: " + id + " and Name: "+ name + "  is deleted " );
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

}  // end of the Queue Class
