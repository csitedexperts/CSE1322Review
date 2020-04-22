package queueImplementation;

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
	@Override
	public String toString(){   // Required
		return name;
	}
}  // End of the Node class


public class QueueImplementationExplained {

	public static void main(String[] args) {

		System.out.println("Queue Implementation Explained ....... ");

		Queue myq = new Queue();

		myq.enQueue(1, "AA");
		
		System.out.println("myq.top = " + myq.head);
		System.out.println("myq.tail = " + myq.tail);

		System.out.println("myq.top.next = " + myq.head.next);
		System.out.println("myq.tail.next = " + myq.tail.next);

		myq.enQueue(2, "BB");

		System.out.println("myq.top = " + myq.head);
		System.out.println("myq.tail = " + myq.tail);

		System.out.println("myq.top.next = " + myq.head.next);
		System.out.println("myq.tail.next = " + myq.tail.next);

		myq.enQueue(3, "CC");
		myq.enQueue(4, "DD");
		myq.enQueue(5, "EE");


		myq.displayAllNodes();

		myq.peek();
		myq.bottom();
		
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();

		myq.enQueue(50, "ZZ");


		myq.peek();
		myq.bottom();

		myq.displayAllNodes();

	}

}
