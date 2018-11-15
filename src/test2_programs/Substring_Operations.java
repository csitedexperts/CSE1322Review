package test2_programs;

public class Substring_Operations {

	public static void main(String[] args) {

		String greeting = "Luke, Use the force Luke!";
		System.out.println(greeting.substring(7, 20));		

	
		String s = "Bonds";
		s = s + s.length();
		System.out.println(s);		

		String a = "Agent";
		a = a + a.length();
		System.out.println(a);		

		System.out.println("===============");
		
		String greetings = "Hello World! I like OOP";
		System.out.println(greetings.substring(5, 15));		

		String k = "Kennesaw";
		k = k + k.length();
		System.out.println(k);		
	
		String state = "Pennsylvenia";
		
		System.out.println(state.substring(2, 5));		

		System.out.println(state.substring(2, state.length() - 3));		

		System.out.println(state.substring(1));		

/*
		String river = "Mississippi";
		
		System.out.println(river.substring(2, 5));		

		System.out.println(river.substring(2, river.length() - 3));		

		System.out.println(river.substring(1));		

*/
	}


}
