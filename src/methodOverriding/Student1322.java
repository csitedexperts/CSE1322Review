package methodOverriding;

public class Student1322
{
	int  roll;	
	String name;
	double marks;	

	public Student1322(int roll, String name, double marks) {
		this.roll= roll; 
		this.name = name; 
		this.marks = marks;
	}
	
/*	@Override
	public String toString() {
		return "Roll: " + roll + " Name: " + name + " Marks: " + marks;
	}
*/
	public static void main(String args[]) {

		Student1322	s1 = new Student1322(101, "John", 95.5); 
		System.out.println(s1);
		System.out.println(s1.toString());
	}
	
	
}  
