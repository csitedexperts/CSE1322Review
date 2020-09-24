package doublyLinkedList;
import java.util.NoSuchElementException;

// Source: http://www.java2novice.com/data-structures-in-java/linked-list/doubly-linked-list/
// Another at: https://algs4.cs.princeton.edu/13stacks/DoublyLinkedList.java.html
//Another at:  https://www.sanfoundry.com/java-program-implement-doubly-linked-list/

 


public class DoublyLinkedListExplained {


	public static void main(String a[]){

		DoublyLinkedList dll = new DoublyLinkedList();
		System.out.println(dll.size());
		
		dll.append(1, "A");
		dll.append(2, "B");
		dll.prepend(3, "C");
		dll.append(4, "D");
		dll.append(5, "E");

		dll.displayAllNodes();

		dll.iterateForward();
		dll.removeFirst();
		dll.removeLast();
		dll.iterateBackward();
	}
}
