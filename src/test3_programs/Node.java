package test3_programs;

public class Node {
	int id;
	Node next; 

	public Node(int id){
		this.id = id;
	}

	public void displayANode(){
		System.out.println("id: " + id );
	}

	@Override
	public String toString(){   // Required
		return ""+ id;
	}

}  // End of the Node class
