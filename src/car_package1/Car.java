package car_package1;

//import car_package2.Vehicle;

public class Car extends Vehicle implements Cloneable, IAirVehicle, IWaterVehicle //, IMotorVehicle
{
	protected String make;
	String model;
	private int year;
	
	static String type = "Private";
	static int carCount =0;
	
	public String getMake() {
		return make;   // get ter => get.. ret   
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public Car() {
		carCount++;
	}
	
	
	public Car (String make, String Model, int year) {
		this.make = make;
		model = Model;
		this.year = year;
		carCount++;
	}

	public Car (String make, String Model) {
		this.make = make;
		model = Model;
		
	}
	
	public Car (String make) {
		this.make = make;
		
	}

	
	
	@Override
	public String toString() {
		System.out.println(carCount);
		return "Car [make=" + make + ", model=" + model + ", year=" + year + " " + type + "]" ;
	}

	@Override
	public void EngineType() {
	// ndsjapofv psajfv saopfv paso
		
	}
	/*
	@Override
	public  void BodyType() {
		 System.out.println("Car:: BodyType ....  ");
	 }
*/

	@Override
	public void WaterType() {
		 System.out.println("IWaterVehicle :: BodyType ....  ");
			
	}

	@Override
	public void AirType() {
		 System.out.println("IAirVehicle :: BodyType ....  ");
			
		
	}

	@Override
	public void MotorType() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
    public Object clone() 
    throws CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
	
	
}

