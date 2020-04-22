package queueImplementation;

public class Queue {
	Node head;
	Node tail;

	Queue(){   // Optional 
		head = null;  // null initialization
		tail = null;  // null initialization
		// Here to show the head and tail always start as null
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void peek() {
		if(isEmpty())
			System.out.println("There is nothing to peek");
		else {
			System.out.println("The top node's id is : " + head.id);
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
		
		if(isEmpty()) {
			head = node;
			tail = node;
		}
		else {
			tail.next = node;
			tail = node;
		}
		
	}

	public void deQueue() {
		if (head == tail) {
			//tail = null;
			System.out.println("There is no node to delete" );
			//return;
		}
		else {
			int id = head.id;
			String name = head.name;
			System.out.println("The node with Id: " + id + " and Name: "+ name + "  is deleted " );
			head = head.next;
		}
	}


	public void displayAllNodes(){

		Node thisNode = head;

		while(thisNode != null){
			thisNode.displayANode();
			System.out.println("Next Node: " + thisNode.next);
			thisNode = thisNode.next;
			System.out.println();
		}

	}

}  // end of the Queue Class
