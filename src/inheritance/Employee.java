package inheritance;
public class Employee{
	 String empName;
	 int empId;	

	Employee(){
		System.out.println("Employee class non-argumented Constructor called");
	}

	Employee(String empName, int empId){
		this();
		System.out.println("=============================");
		this.empName = empName;
		this.empId = empId;
		
		System.out.println("Employee class argumented Constructor called");
		
	}

}
