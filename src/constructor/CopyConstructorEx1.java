package constructor;

public class CopyConstructorEx1{
	public static void main(String args[]) {
		Student	S1 = new Student(); 	// Default Constructor Invoked
		System.out.println(S1);
		
		System.out.println("Record of S1 : " );
		S1.display();
		System.out.println();
		Student S2 = new Student(101, "Hossain", 80); 
		// Argumented Constructor Invoked
		System.out.println("Record of S2 : " );
		S2.display();
		Student   S3 = new Student(S1);  //  Copy Constructor Invoked
		System.out.println();
		System.out.println("Record of S3 : " );
		S3.display();  // displays Record of S1

		
	}
}
