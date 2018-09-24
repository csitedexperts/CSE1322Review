package lecture11;
/*	CallByValueEx2.java   */
/*   Example of Call by Value Process  */

public class CallByValueEx2 {

	public static void main(String[] args) {
		String myname = "Mokter";  
		// myname is a is String reference local variable
		System.out.println("Initially, inside main(), Name = " + myname );
		callMe(myname);
		System.out.println("After calling callMe(), Name = " + myname); 
		// Look here ??!!??
		System.out.println("Now, inside main(), Name = " + myname );
	}

	static void callMe(String newname ){  
	// newname is String reference argument
		newname = "Dr. Mokter Hossain";
		System.out.println("Inside callMe(), Name = " + newname );
	}
}

