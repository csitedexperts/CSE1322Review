package singlyLinkedList;


public class SinglyLinkedListMain {


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
		n6.displayANode();
		
		System.out.println("== = = = =  = = = = = = = = = = ") ;
		
		System.out.println("n1.next :" + n1.next) ;
		
		System.out.println("n2.next :" + n2.next) ;
		System.out.println("n3.next :" + n3.next) ;
		System.out.println("n4.next :" + n4.next) ;
		System.out.println("n5.next :" + n5.next) ;
		System.out.println("n6.next :" + n6.next) ;


		System.out.println("\n= ==  After liking the nodes = = = =  = \n" ) ;

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = null;

		System.out.println("n1.next :" + n1.next) ;
		System.out.println("n2.next :" + n2.next) ;
		System.out.println("n3.next :" + n3.next) ;
		System.out.println("n4.next :" + n4.next) ;
		System.out.println("n5.next :" + n5.next) ;
		System.out.println("n6.next :" + n6.next) ;


		System.out.println("++++++++++++++++++++++++++");
		n1.next.displayANode();

		n2.displayANode();
		n3.displayANode();
		n4.displayANode();
		n5.displayANode();
		n6.displayANode();

		System.out.println("++++++++++++++++++++++++++");

		System.out.println("===========================");

		System.out.println("===========================");
*/

		LinkedList ll = new LinkedList();

		ll.append(101, "Michael");
		ll.prepend(102, "Sasah");
		
		ll.append(103, "Braxton");
		ll.append(104, "Lee");
		ll.prepend(105, "Mokter");
		
		
		// Mokter -> Sarah -> Michael -> Braxton -> Lee
		
		
		
		//  105 > 102 > 101 > 103  > 104 
		ll.displayAllNodes();

		System.out.println("searchById()");

		ll.searchById(103);
		System.out.println("searchById2(): " + ll.searchById2(103));
		System.out.println("searchById2(): " + ll.searchById2(1003));
			
		

		/*		// Insert Link and add a reference to the name Link added just prior
		// to the field next
		theLinkedList.prepend(0, "O");

		theLinkedList.append(1, "A");
		theLinkedList.prepend(2, "B");
		theLinkedList.append(3, "C");
		theLinkedList.prepend(4, "D");
		theLinkedList.append(5, "E");

		theLinkedList.displayAllNodes();

		System.out.println("Value of first in LinkedList " + theLinkedList.head + "\n");

		// Removes the last Link entered

		theLinkedList.removeFirst();

		theLinkedList.displayAllNodes();

		System.out.println(theLinkedList.findByName("C").name + " Was Found");

		//		theLinkedList.removeByName("B");
		theLinkedList.removeById(2);
		System.out.println("\nB Removed\n");

		theLinkedList.displayAllNodes();*/

	}

}
