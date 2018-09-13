package classAndObjects;
public class Student1322
{
	private int  Roll;	
	private String Name;
	private float Mark;	

	public int getRoll() { return Roll; }
	public void setRoll(int roll) {	Roll = roll; }
	public String getName() { return Name; }
	public void setName(String name) {	Name = name; }
	public float getMark() {return Mark; }
	public void setMark(float mark) { Mark = mark; }

	public String toString() {
		String output = "Roll: " + getRoll() + 
				"\tName: " + getName() +
				"\tMark: " + getMark();
		return output;

	}


	
	
}  
