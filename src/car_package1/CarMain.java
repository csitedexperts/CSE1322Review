package car_package1;

public class CarMain {

	public static void display() {
		System.out.println(Car.carCount);
		 
		
	}	

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
// override the toString()/ToString() method 
		// to display the Car’s attributes on screen

		int x = 5;
		//System.out.println(x);
		
		Car c1 = new Car();
		
		c1.BodyType();
		
		System.out.println(c1.waterType);
		
		Car c11 = (Car)c1.clone();
		System.out.println(c1);
		System.out.println(c11);
		
		
		Car c2 = new Car();
		Car c3 = new Car();
		Car c4 = new Car();
		Car c5 = new Car();
		Car c6 = new Car("BMW", "CRV", 2019);
		
		display();
		
//		c1.type = "Private";
		c1.make = "Toyota";  // make of c1 is "Toyota" 
		
		c2.make = "Honda";  // make of c2 is "Honda"
//		c2.type = "Private";
		
		c1.model = "Corolla";
//		c1.year = 2020;
		c1.setYear(2020);
		c2.setYear(2022);
		
		System.out.println(c1.getYear());
		System.out.println(c2.getYear());
		
		System.out.println(c1);
		System.out.println(c2);
	
		//System.out.println("Number of Car obj created " + c1.carCount);

		System.out.println("Number of Car obj created " + Car.carCount);
		
		c1.SetVDetail("sajv olaksjv ");
		
		//Vehicle v1 = new Vehicle();
		 Vehicle v2 = new Car();  	// ??
		
		//Car v3 = new Vehicle();  	// ??
		// x = y;
		 
		 // Car c111 = new Vehicle();
		 
		 Car c112 = new Car();
		// Car c113 = new Train();
		 
		Vehicle c114 = new Car();
		 
		//Vehicle c115 = new Vehicle();
			 


		 
	}

}
