package InheritanceStudentClass;

public class Student{
	public String name; 
	public int numCreditHours; 
	private boolean isInState;
	
	public Student() {  } 
	public Student(String name, int numCreditHours, boolean isInState) {
		this.name = name; 
		this.numCreditHours = numCreditHours;
		this.isInState = isInState; 
	} 
	public void setisInState(boolean isInState) { 
		this.isInState = isInState; 
		} 
	
	public boolean getisInState() { 
		return isInState; 
		} 
	
	@Override
	public String toString() { 
		return "Name: " + name + " numCreditHours: " + numCreditHours + " isInState: " + isInState; 
	} 

	public boolean isGraduating() { return false; }
	
	public static void main(String args[]) {
		Student t1 = new Student("John Doe", 23, false);
		Student t2 = new Student("Robert Smith", 21, true);
		System.out.println(t1); 
		System.out.println(t2);

	} 
}
