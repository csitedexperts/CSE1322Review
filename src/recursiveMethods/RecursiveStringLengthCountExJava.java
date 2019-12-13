package recursiveMethods;

public class RecursiveStringLengthCountExJava {

	public static void main(String[] args) {
		String hello = "Hello World"; 
		System.out.println("Length of the string '"+ 
		hello +"' is : "+ recursiveStringCount(hello));
	
	}
	

	static int recursiveStringCount(String str) {
		if (str.isEmpty())
			return 0;
		
		else{
			return (recursiveStringCount(str.substring(1) ) + 1);  // recursion makes here
		}

}
	
}
