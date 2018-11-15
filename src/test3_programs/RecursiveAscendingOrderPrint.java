package test3_programs;

public class RecursiveAscendingOrderPrint {

	public static void main(String args[]) {
		printNumbers(10);
	}  
	static void printNumbers(int n) {
		if (n<=0)
			return ;		
		else {
			printNumbers(n-1);  // recursion makes here
			System.out.print(n + "  ");
		}
	}
}  

