package stringOperations;

public class SlidePageNo15 {
	public static void main(String[] args) {
		String oop = "I like Object-Oriented Programming";
		System.out.println(oop.substring(7, 14));
		
		String s ="Agent";
		s = s + s.length(); 
		System.out.println(s);
		String river ="Mississippi River";

		System.out.println(river.substring(2, 6));
		System.out.println(river.substring(2, river.length() - 3));
		System.out.println(river.substring(1));
		System.out.println(river.substring(1,river.length()));
	}
}
