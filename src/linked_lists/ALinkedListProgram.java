package linked_lists;
//https://www.youtube.com/watch?v=195KUinjBpU


class Node {
	// Set to public so getters & setters aren't needed
	public int id;
	public String name;
	
	// Reference to next link made in the LinkList
	// Holds the reference to the Link that was created before it
	// Set to null until it is connected to other links

	private Node next; 

	public Node(int id, String name){
		this.id = id;
		this.name = name;
		this.next = null;   // null initialization
		
	}

	public void display(){
		System.out.println("id: " + id + " name:" + name );
	}

	public String toString(){
		return name;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}


public	class ALinkedListProgram{
		
		// Reference to first Link in list
		// The last Link added to the LinkedList
		
		public Node firstLink; 
		
		ALinkedListProgram(){
					// Here to show the first Link always starts as null
			firstLink = null;
			
		}
		
		// Returns true if LinkList is empty
		
		public boolean isEmpty(){
			return(firstLink == null);
			
		}
		
		public void insertFirstLink(int id, String name){
			
			Node newLink = new Node(id, name);
			
			// Connects the firstLink field to the new Link 
			
			newLink.setNext(firstLink);
			
			firstLink = newLink;
			
		}
		
		public Node removeFirst(){
			
			Node linkReference = firstLink;
			
			if(!isEmpty()){
			
				// Removes the Link from the List
			
				firstLink = firstLink.getNext();
			
			} else {
				
				System.out.println("Empty LinkedList");
				
			}
			
			return linkReference;
			
		}
		
		public void display(){
			
			Node theLink = firstLink;
			
			// Start at the reference stored in firstLink and
			// keep getting the references stored in next for
			// every Link until next returns null
			
			while(theLink != null){
				
				theLink.display();
				
				System.out.println("Next Link: " + theLink.getNext());
				
				theLink = theLink.getNext();
				
				System.out.println();
				
			}
			
		}
		
		public Node find(String bookName){
			
			Node theLink = firstLink;
			
			if(!isEmpty()){
			
				while(theLink.name != bookName){
				
					// Checks if at the end of the LinkedList
				
					if(theLink.getNext() == null){
					
						// Got to the end of the Links in LinkedList
						// without finding a match
					
						return null;
					
					} else {
					
						// Found a matching Link in the LinkedList
					
						theLink = theLink.getNext();
					
					}
				
				}
				
			} else {
				
				System.out.println("Empty LinkedList");
				
			}
			
			return theLink;
			
		}
		
		public Node removeLink(String bookName){
			
			Node currentLink = firstLink;
			Node previousLink = firstLink;
			
			// Keep searching as long as a match isn't made
			
			while(currentLink.name != bookName){
				
				// Check if at the last Link in the LinkedList
				
				if(currentLink.getNext() == null){
					
					// bookName not found so leave the method
					
					return null; 
					
				} else {
					
					// We checked here so let's look in the
					// next Link on the list
					
					previousLink = currentLink; 
					
					currentLink = currentLink.getNext();
					
				}
				
			}
			
			if(currentLink == firstLink){
				
				// If you are here that means there was a match
				// in the reference stored in firstLink in the
				// LinkedList so just assign next to firstLink
				
				firstLink = firstLink.getNext();
				
			} else {
				
				// If you are here there was a match in a Link other 
				// than the firstLink. Assign the value of next for
				// the Link you want to delete to the Link that's 
				// next previously pointed to the reference to remove
				
				System.out.println("FOUND A MATCH");
				System.out.println("currentLink: " + currentLink);
				System.out.println("firstLink: " + firstLink);
				
				previousLink.setNext(currentLink.getNext());
				
			}
			
			return currentLink;
			
		}
	
	
	public static void main(String[] args) {

		ALinkedListProgram theLinkedList = new ALinkedListProgram();

		// Insert Link and add a reference to the book Link added just prior
		// to the field next

		theLinkedList.insertFirstLink(1, "A");
		theLinkedList.insertFirstLink(2, "B");
		theLinkedList.insertFirstLink(3, "C");
		theLinkedList.insertFirstLink(4, "D");
		theLinkedList.insertFirstLink(5, "E");
		
		theLinkedList.display();

		System.out.println("Value of first in LinkedList " + theLinkedList.firstLink + "\n");

		// Removes the last Link entered

		theLinkedList.removeFirst();

		theLinkedList.display();

		System.out.println(theLinkedList.find("C").name + " Was Found");

		theLinkedList.removeLink("B");

		System.out.println("\nB Removed\n");

		theLinkedList.display();

	}

}