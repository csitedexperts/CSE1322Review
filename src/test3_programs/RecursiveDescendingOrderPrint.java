package test3_programs;

public class RecursiveDescendingOrderPrint
{
	public static void main(String args[]) {
		printNumbers(10);
	}  

	static void printNumbers(int n) {
		if (n==0)
			return;
		else{
			System.out.print(n + "  ");
			printNumbers(n-1);  // recursion makes here
		}
	}
}  
