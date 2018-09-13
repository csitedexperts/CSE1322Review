package methodOverriding;
public class Overriding_toString {
  
    public static void main(String[] args) {
    	int x = 101;
    	System.out.println("x = " + x);
//    	System.out.println("x = " + x.toString); // Invalid use of toString()
    	
    	Integer y = 202;
    	System.out.println("y = " + y);
    	System.out.println("y.toString() = " + y.toString());
    	
    }
}