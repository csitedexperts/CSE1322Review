package methodOverriding;
public class Calling_toString_Overriding {
  
    public static void main(String[] args) {
    	int x = 101;
    	System.out.println("x = " + x);
    	
    	Integer y = 202;
    	System.out.println("y = " + y);
    	System.out.println("y.toString() = " + y.toString());
    	
    	// Calling toString() with argument
    	System.out.println("(12).toString() = " + Integer.toString(12));
    	System.out.println("(12.5).toString() = " + Double.toString(12.5));
    }
}