package test3_programs;

public class ImplelemtASLL {


	public static void main(String[] args) {


		LinkedList sll = new LinkedList();
		sll.prepend(0);
		sll.append(1);
		sll.append(3);
		sll.findById(2);
		
		
		sll.displayAllNodes();

		System.out.println("Value of first in LinkedList " + sll.head + "\n");


		sll.displayAllNodes();


	}

}