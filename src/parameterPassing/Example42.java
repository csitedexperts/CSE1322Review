package parameterPassing;

public class Example42{
	public static void main(String[] args) {
			String myName = "Mokter";
			System.out.println(myName);
			B(myName);
			System.out.println(myName);
			System.out.println("Press any key to exit.");
		} 
	static void B(String myName) {
		myName = "Mokter Hossain";
		System.out.println(myName);
	}
}




