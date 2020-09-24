package recursiveMethods;

public class RecursiveDescendingOrderPrint {

	public static void main(String args[]) {
		dawark(10);
	}  
	
	static int dawark(int n) {
		if (n!=1)
	{
			System.out.print(dawark(n-1) + "  ");
			dawark(n-1);  // recursion makes here
		
			return n + 1;
		}
		else {
			System.out.print(1 + "  ");
			return 2;
		}
	}
}  

