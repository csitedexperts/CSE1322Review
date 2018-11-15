package test3_programs;

public class LinkedList{
	Node head; 

	LinkedList(){   // Optional 
		head = null;  // null initialization
	}

	public boolean isEmpty(){
		return(head == null);

	}

	public void prepend(int id){
		if (head == null) {
			head = new Node(id);
			return; 
		}
		Node newHead = new Node(id);
		// Connects the head field to the newHead 
		newHead.next = head;
		head = newHead;
	}


	public void append(int id){
		if (head == null) {
			head = new Node(id);
			return; 
		}
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = new Node(id);
	}


	public void displayAllNodes(){

		Node theNode = head;
		while(theNode != null){

			theNode.displayANode();

			System.out.println("Next Link: " + theNode.next);

			theNode = theNode.next;

			System.out.println();

		}

	}

	public Node findById(int id){

		Node theNode = head;

		if(!isEmpty()){

			while(theNode.id != id){

				// Checks if at the end of the LinkedList

				if(theNode.next == null){
//					System.out.println("Not found the node with id = "+ theNode.id);
					
					// Got to the end of the Links in LinkedList
					// without finding a match

					return null;

				} else {

					// Found a matching Link in the LinkedList
//					System.out.println("Found the node with id = "+ theNode.id);
							
					theNode = theNode.next;

				}

				
			}

		} else {

			System.out.println("Empty LinkedList");

		}

		return theNode;

	}



}
