package queueImplementation;

// Please watch: https://www.youtube.com/watch?v=wjI1WNcIntg
class Node {
	int id;
	String name;
	Node next; 

	public Node(int id, String name){
		this.id = id;
		this.name = name;
	}

	public void displayANode(){
		System.out.println("id: " + id + " name:" + name );
	}

	public String toString(){   // Required
		return name;
	}

}  // End of the Node class

class Queue {

	Node head;
	Node tail;

	Queue(){   // Optional 
		head = null;  // null initialization
		tail = null;  // null initialization
		// Here to show the head and tail always start as null
	}

	public boolean isempty() {
		return(head == null);
	}

	public int peek() {
		return head.id;
	}

	public void enQueue(int id, String name) {
		Node node = new Node(id, name);

		if (head == null) {
			head = node;
		}

		if (tail != null) {
			tail.next = node;
		}

		tail = node;

	}

	public void deQueue() {
		int id = head.id;
		String name = head.name;
		
		head = head.next;
		if (head == null) {
			tail = null;
		}
		System.out.println("The node with Id: " + id + " and Name: "+ name + "  is deleted " );
		
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


public class QueueImplementationExplained {


	public static void main(String[] args) {

		System.out.println("Queue Implementation Explained ....... ");

		Queue myq = new Queue();
		myq.enQueue(1, "AA");
		myq.enQueue(2, "BB");
		myq.enQueue(3, "CC");
		myq.enQueue(4, "DD");
		myq.enQueue(5, "EE");

		myq.displayAllNodes();

		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		
		myq.displayAllNodes();

	}

}
