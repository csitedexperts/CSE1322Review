package singlyLinkedList;

// Singly Linked List


public class LinkedList{
	// Reference to head in list
	// The last Link added to the LinkedList
	Node head; 

	LinkedList(){   // Optional 
		head = null;  // null initialization
		// Here to show the head always starts as null
	}

	// LinkedList ln = new LinkedList();

	// Returns true if LinkList is empty


	public boolean isEmpty(){
		/*		
		 if (head == null) 
		 	return true;
		else 
			return false;
		 */
		return(head == null);
	}


	public void displayAllNodes(){

		Node theNode = head;

		// Start at the reference stored in head and
		// keep getting the references stored in next for
		// every Link until next returns null

		while(theNode != null){

			theNode.displayANode();

			System.out.println("Next Link: " + theNode.next);

			theNode = theNode.next;

			System.out.println();

		}

	}

	public void append(int id, String name){
		if (head == null) {
			head = new Node(id, name);
			return; 
		}
		Node currentHead = head;
		while(currentHead.next != null) {
			currentHead = currentHead.next;
		}
		currentHead.next = new Node(id, name);
	}
	
	public void prepend(int id, String name){
		if (head == null) { 
			head = new Node(id, name);
			return; 
		}
		Node newHead = new Node(id, name);
		// Connects the head field to the newHead 
		
		newHead.next = head;
		//		newHead.setNext(head);  // If you use setter
		head = newHead;
	}



	public Node removeFirst(){
		Node deleteLink = head;
		if(isEmpty()){
			// Removes the Link from the List
			System.out.println("Empty LinkedList");
		} else {

			head = head.next;

		}
		return deleteLink;
	}



	public Node removeSecondNode(){
		Node deleteLink = head;
		if(isEmpty()){
			// Removes the Link from the List
			System.out.println("Empty LinkedList");
		}
		else if(head.next == null){
			// Removes the Link from the List
			System.out.println("There is only one node");
		}
		else {

			head = head.next.next;

		}
		return deleteLink;
	}

	public Node removeById(int id){
		Node currentHead = head;
		Node previousHead = head;

		// Keep searching as long as a match isn't made

		while(currentHead.id != id){

			// Check if at the last Link in the LinkedList

			if(currentHead.next == null){

				// id not found so leave the method

				return null; 

			} else {

				// We checked here so let's look in the
				// next Link on the list

				previousHead = currentHead; 

				currentHead = currentHead.next;

			}

		}

		if(currentHead == head){

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
			System.out.println("currentLink: " + currentHead);
			System.out.println("head: " + head);
			previousHead.next = currentHead.next; 

			//			previousLink.setNext(currentLink.next);  // If use getter and setter

		}

		return currentHead;

	}


	public Node removeByName(String name){
		Node currentNode = head;
		Node previousNode = head;

		// Keep searching as long as a match isn't made

		while(currentNode.name != name){
			// Check if at the last Link in the LinkedList

			if(currentNode.next == null){

				// Name not found so leave the method
				return null; 

			} else {

				// We checked here so let's look in the
				// next Link on the list

				previousNode = currentNode; 

				currentNode = currentNode.next;

			}

		}

		if(currentNode == head){

			// If you are here that means there was a match
			// in the reference stored in head in the
			// LinkedList so just assign next to head

			head = head.next;

		} else {

			// than the head. Assign the value of next for
			// the node you want to delete to the node that's 
			// next previously pointed to the reference to remove

			System.out.println("Name found:");
			System.out.println("currentNode: " + currentNode);
			System.out.println("head: " + head);
			previousNode.next = currentNode.next; 

			//			previousNode.setNext(currentNode.next);  // If use getter and setter

		}

		return currentNode;

	}


	public void searchById(int id){
		Node node = head;
		boolean isFound = false;
		if(isEmpty()){
			System.out.println("Empty LinkedList");
		}
		else{
			while(node != null){		
				if(node.id == id){
					// Found a matching Link in the LinkedList
					isFound = true;
				} 
				node = node.next; // Go to the next node
			}
		}

		if(isFound) {
			System.out.println("Found the node with id = " + id);
		
		}
		else
			System.out.println("No node found with id = " + id);
		
	}

	
	public int searchById2(int id){
		
		int isFound = -1;
		if(isEmpty()){
			System.out.println("Empty LinkedList");
			return isFound;
		}
		Node node = head;
			while(node != null){		
				if(node.id == id){
					// Found a matching Link in the LinkedList
					isFound = 0;
					return isFound;
				}
				else {
				node = node.next; // Go to the next node
				}
			}
			//if (isFound != -1){
				return isFound;
			//}
		}



	

	public Node findById(int id){
		Node theNode = head;
		if(!isEmpty()){
			while(theNode.id != id){
				// Checks if at the end of the LinkedList
				if(theNode.next == null){
					// Got to the end of the Links in LinkedList
					// without finding a match
					return null;
				} else {
					// Found a matching Link in the LinkedList
					theNode = theNode.next;
				}
			}
		} else {

			System.out.println("Empty LinkedList");

		}

		return theNode;

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

}
