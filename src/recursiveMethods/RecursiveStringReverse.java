package recursiveMethods;
/*Example of Recursive Method */

public class RecursiveStringReverse {
	public static void main(String args[]) {
		String s = "hello"; 
		
		System.out.println("Using the reverse(): Reverse of the string '"+ 
		s +"' is : "+ reverse1(s));
		
		
		System.out.println("Using the reverse2(): Reverse of the string '"+ 
				s +"' is : "+ reverse2(s));
				
		System.out.println("Using the reverse3(): Reverse of the string '"+ 
				s +"' is : "+ reverse3(s));
		
		System.out.println("Using the reverse4(): Reverse of the string '"+ 
				s +"' is : "+ reverse4(s));
		
		System.out.println("Using the reverse5(): Reverse of the string '"+ 
				s +"' is : "+ reverse5(s));
		
	}  

	static String reverse1(String s) {
		if (s.isEmpty())
			return s;
		else{
			return (reverse1(s.substring(1)) +
					s.charAt(0));  // recursion makes here
		}
	}


	static String reverse2(String s) {
		if (s == null  || s.length() <=1)
			return s;
		else{
			return (reverse2(s.substring(1)) +
					s.charAt(0));  // recursion makes here
		}
	}

	
	static String reverse3(String s) {
		if (s.length() <=1)
			return s;
		return (reverse3(s.substring(1)) +
					s.charAt(0));  // recursion makes here
	}
	
	static String reverse4(String s) {
		
		if(s.length()==1)
			return s;
		
		return s.charAt(s.length()-1) + reverse4(s.substring(0, s.length()-1));
		
		
	}
	
	
	static String reverse5(String s) {
		if (s.length() == 1)
			return Character.toString(s.charAt(0));
		
		return (Character.toString(s.charAt(s.length() -1 ))) + 
				reverse5(s.substring(0, s.length()-1));
			
	}   
	

	
}  

