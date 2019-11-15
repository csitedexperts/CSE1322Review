package recursiveMethods;
/*Example of Recursive Method */

import java.util.Scanner;

public class RecursiveStringReverse {
	public static void main(String args[]) {
//		String name = null;
		
		String hello = "Hello"; 
		System.out.println("Reverse of the string '"+ hello +"' is : "+ reverse(hello));

		Scanner s = new Scanner (System.in);
		System.out.print("Enter your name : ");
		String name = s.nextLine();
		
		System.out.println("Reverse of the string '"+ name +"' is : "+ reverse(name));
		s.close();
	}  

	static String reverse(String str) {
		if (str == null  || str.length() <=1)
			
			return str;
		else{
			return (reverse(str.substring(1)) +  str.charAt(0));  // recursion makes here
		}
	}
}  

