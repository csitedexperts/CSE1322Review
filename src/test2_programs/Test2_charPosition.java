package test2_programs;

public class Test2_charPosition {

	public static void main(String[] args) {

		String oop = "I like Object-Oriented Programming";

		System.out.println(charPosition(oop));		

	}

	static int charPosition(String str) {
		
		return str.indexOf('P');
	}

}
