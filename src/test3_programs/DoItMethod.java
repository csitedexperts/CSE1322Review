package test3_programs;


public class DoItMethod {

	static int DoIt(int a, int b)
	{
		a += 5;
		b *= 8;
		System.out.println(a + " " + b); // printline 2
		return (a + b);
	}

	public static void main(String[] args) {
		int x = 91; 
		int y = 7;  
		System.out.println(x + " " + y); // printline 1
		int z = DoIt(x, y);
		System.out.println(x + " " + y + " " + z);  // printline 3

	}

}
