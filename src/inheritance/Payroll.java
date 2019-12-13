package inheritance;

class Employee extends Object{
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

public class Payroll extends Employee {

	float baseSalary; 

	public Payroll() {
		super(); // implicitly called by default - optional
		
		System.out.println("Payroll class non-argumented constructor called");
		
	}

	public Payroll(String empName, int empId, float baseSalary) {
		super(empName, empId); // Does not call implicitly - Required

		System.out.println("Payroll class argumented constructor called");

		this.empName = super.empName;
		this.empId = super.empId;
		this.baseSalary = baseSalary;

		System.out.println("In Payroll empName : " + this.empName);
		System.out.println("In Payroll empId : " + this.empId);
		System.out.println("In Payroll baseSalary : " + this.baseSalary);


	}

	public static void main(String[] args) {
		
		Payroll pr1 = new Payroll();
//		pr1.
		
		System.out.println("-------------------------");
		Payroll pr2 = new Payroll("John", 303, 78000f);
		
	}

}
