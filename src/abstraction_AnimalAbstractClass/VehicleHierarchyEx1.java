package abstraction_AnimalAbstractClass;
// VehicleHierarchyEx1.java

interface   Vehicle{
	boolean hasAnEngine= true;
	public void vehicleInfo();
//	public static boolean isSameCar(Car c1, Car c2) ;
}

class Car implements Vehicle {
	String make;
	String model;
	
	String vehicleInfo;
	int  maxSpeed;
	int  maxCapacity;
	
	Car(String carInfo, String make, String model){
		this.vehicleInfo = carInfo;
	}
	
	@Override
	public void vehicleInfo() {
		System.out.println("This is a " + this.vehicleInfo);
	}

	public static boolean isSameCar(Car c1, Car c2) {
		
		return (
				(c1.vehicleInfo.equals(c2.vehicleInfo)) && 
				(c1.make.equals(c2.make)) && 
					(c1.model.equals(c2.model)) 
						);
	}
	
	
}

class Truck implements Vehicle {
	
	String vehicleInfo;
	int  maxSpeed=0;
	int  maxLoad=0;

	Truck(String truckInfo){
		this.vehicleInfo = truckInfo;
	}

	@Override
	public void vehicleInfo() {
		System.out.println("This is a " + this.vehicleInfo);
	}

}

public class VehicleHierarchyEx1 {
	public static void main(String[]  args) {
		Car myCar1 = new Car("Toyota Camry 2016", "Toyota", "Camry");
		myCar1.vehicleInfo();
		Car myCar2 = new Car("Maruti Swift 2015", "Maruti", "Swift");
		myCar2.vehicleInfo();
		
		Truck myTruck1 = new Truck("Ford Focus-150 2016");
		myTruck1.vehicleInfo();
		
		isSameCar(myCar1, myCar2);
		
		

	}

	private static void isSameCar(Car myCar1, Car myCar2) {
		// TODO Auto-generated method stub
		
	}
}
