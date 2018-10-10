package linkedLists;

class Node {
	// Set to public so getters & setters aren't needed
	int id;
	String name;

	// Reference to next link made in the LinkList
	// Holds the reference to the Link that was created before it
	// Set to null until it is connected to other links

	Node next; 

	public Node(int id, String name){
		this.id = id;
		this.name = name;
	}


	public void displayData(){
		System.out.println("id: " + id + " name:" + name );
	}

	public String toString(){   // Required
		return name;
	}

	/*	public Node getNext() { return next; 	}  */
	/*public void setNext(Node next) { this.next = next; } */


}

class LinkedList{
	// Reference to head in list
	// The last Link added to the LinkedList
	public Node head; 

	LinkedList(){   // Optional 
		head = null;  // null initialization
		// Here to show the head always starts as null
	}

	// Returns true if LinkList is empty

	public boolean isEmpty(){
		return(head == null);

	}

	public void prepend(int id, String name){

		Node newHead = new Node(id, name);
		// Connects the head field to the newhead 
		newHead.next = head;
		//		newHead.setNext(head);  // If you use setter

		head = newHead;

	}


	public void append(int id, String name){

		Node newHead = new Node(id, name);
		// Connects the head field to the newhead 
		newHead.next = head;
		//		newHead.setNext(head);  // If you use setter

		head = newHead;

	}

	
	public Node removeFirst(){

		Node linkReference = head;

		if(!isEmpty()){

			// Removes the Link from the List

			head = head.next;

		} else {

			System.out.println("Empty LinkedList");

		}

		return linkReference;

	}

	public void displayNodes(){

		Node theLink = head;

		// Start at the reference stored in head and
		// keep getting the references stored in next for
		// every Link until next returns null

		while(theLink != null){

			theLink.displayData();

			System.out.println("Next Link: " + theLink.next);

			theLink = theLink.next;

			System.out.println();

		}

	}

	public Node findById(String id){

		Node theLink = head;

		if(!isEmpty()){

			while(theLink.name != id){

				// Checks if at the end of the LinkedList

				if(theLink.next == null){

					// Got to the end of the Links in LinkedList
					// without finding a match

					return null;

				} else {

					// Found a matching Link in the LinkedList

					theLink = theLink.next;

				}

			}

		} else {

			System.out.println("Empty LinkedList");

		}

		return theLink;

	}


	public Node findByName(String name){

		Node theLink = head;

		if(!isEmpty()){

			while(theLink.name != name){

				// Checks if at the end of the LinkedList

				if(theLink.next == null){

					// Got to the end of the Links in LinkedList
					// without finding a match

					return null;

				} else {

					// Found a matching Link in the LinkedList

					theLink = theLink.next;

				}

			}

		} else {

			System.out.println("Empty LinkedList");

		}

		return theLink;

	}


	public Node removeLink(String bookName){

		Node currentLink = head;
		Node previousLink = head;

		// Keep searching as long as a match isn't made

		while(currentLink.name != bookName){

			// Check if at the last Link in the LinkedList

			if(currentLink.next == null){

				// bookName not found so leave the method

				return null; 

			} else {

				// We checked here so let's look in the
				// next Link on the list

				previousLink = currentLink; 

				currentLink = currentLink.next;

			}

		}

		if(currentLink == head){

			// If you are here that means there was a match
			// in the reference stored in head in the
			// LinkedList so just assign next to head

			head = head.next;

		} else {

			// If you are here there was a match in a Link other 
			// than the head. Assign the value of next for
			// the Link you want to delete to the Link that's 
			// next previously pointed to the reference to remove

			System.out.println("FOUND A MATCH");
			System.out.println("currentLink: " + currentLink);
			System.out.println("head: " + head);
			previousLink.next = currentLink.next; 

			//			previousLink.setNext(currentLink.next);  // If use getter and setter

		}

		return currentLink;

	}

}


public class SinglyLinkedListExplained {


	public static void main(String[] args) {


		LinkedList theLinkedList = new LinkedList();

		// Insert Link and add a reference to the book Link added just prior
		// to the field next

		theLinkedList.prepend(1, "A");
		theLinkedList.prepend(2, "B");
		theLinkedList.prepend(3, "C");
		theLinkedList.prepend(4, "D");
		theLinkedList.prepend(5, "E");

		theLinkedList.displayNodes();

		System.out.println("Value of first in LinkedList " + theLinkedList.head + "\n");

		// Removes the last Link entered

		theLinkedList.removeFirst();

		theLinkedList.displayNodes();

		System.out.println(theLinkedList.findByName("C").name + " Was Found");

		theLinkedList.removeLink("B");

		System.out.println("\nB Removed\n");

		theLinkedList.displayNodes();

	}

}
