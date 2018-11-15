package test3_programs;

public class ImplelemtAStack {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.push(3);
		s.push(10);
		s.push(14);
//		s.displayAllNodes();
//		s.pop();
		System.out.println(s);
		s.peek();
		s.push(4);
		s.pop();
		
		s.displayAllNodes();

	}

}