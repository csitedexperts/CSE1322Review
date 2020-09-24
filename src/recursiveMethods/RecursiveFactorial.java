package recursiveMethods;
/*Example of Recursive Method */

public class RecursiveFactorial {
	public static void main(String args[]) {
		int n=5; 
		System.out.println("Using fact1() Factorial of "+ n +" is : "+ fact1(n));
		
		//System.out.println("Using fact2() Factorial of "+ n +" is : "+ fact2(n));
			
		System.out.println("Using fact3() Factorial of "+ n +" is : "+ fact3(n));
		
		System.out.println("Using findFactorial() Factorial of "+ n +" is : "+ findFactorial(n));
	}  

	static int fact1(int n) {
		if (n <= 1)
			return 1;
		else{
			return n * fact1(n-1);  // recursion makes here
		}
	}

	static int fact2(int n) {
		while (n > 0)
			fact2(n-1); // recursion makes here
		int factorial = n * n-1;
			return factorial;  
	
	}

	static int fact3(int n) {
		if (n == 0)
			return 1;
		else{
			int total = n;
			return total * fact3(n-1);  // recursion makes here
		}
	}
	
	public static int  findFactorial(int n) 
	{ 
		if (n <=1) return 1;
		else {
			//n = n * findFactorial(n-1);
			
		return n * findFactorial(n-1);
		}
		
		}
	
}  

