package linkedLists;

class Node {
	int id;
	String name;
	Node next; 
	// Reference to next link made in the LinkList
	// Holds the reference to the Link that was created before it
	// Set to null until it is connected to other links
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

	/*	public Node getNext() { return next; 	}  */
	/*public void setNext(Node next) { this.next = next; } */
}

class LinkedList{
	// Reference to head in list
	// The last Link added to the LinkedList
	Node head; 

	LinkedList(){   // Optional 
		head = null;  // null initialization
		// Here to show the head always starts as null
	}

	// Returns true if LinkList is empty
	public boolean isEmpty(){
		if (head == null)
			return true;
		else 
			return false;

		// return (head == null);
		
	}
	
}

public class SinglyLinkedListExplained {


	public static void main(String[] args) {
/*
		Node n1 = new Node(1, "n1");
		Node n2 = new Node(2, "n2");
		Node n3 = new Node(3, "n3");
		Node n4 = new Node(4, "n4");
		Node n5 = new Node(5, "n5");
		Node n6 = new Node(6, "n6");

		n1.displayANode();
		n2.displayANode();
		n3.displayANode();
		n4.displayANode();
		n5.displayANode();

		n1.next = n2;
		n2.next = n3;
	//	n3.next = n4;
		n3.next = n5;
		n5.next = n6;
		n6.next = null;
		//		n1 > n2 > n3 > n4 > n5 > n6 > null

		System.out.println("n1.next :" + n1.next) ;
		System.out.println("n2.next :" + n2.next) ;
		System.out.println("n3.next :" + n3.next) ;
		System.out.println("n4.next :" + n4.next) ;
		System.out.println("n5.next :" + n5.next) ;
		System.out.println("n6.next :" + n6.next) ;

*/
		
		LinkedList ls1 = new LinkedList();
		
		System.out.println(ls1.isEmpty());
		
	}

}

