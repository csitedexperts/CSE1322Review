package FurnitureClass;

class Furniture{
	public String name; 
	public int price; 
	private boolean isGood;
	
	public Furniture() {  } 
	public Furniture(String name, int price, boolean isGood) {
		this.name = name; 
		this.price = price;
		this.isGood = isGood; 
	} 
	public void setisGood(boolean isGood) { 
		this.isGood = isGood; 
		} 
	
	public boolean getisGood() { 
		return isGood; 
		} 
	
	@Override
	public String toString() { 
		return "Name: " + name + " price: " + price + " isGood: " + isGood; 
	} 

	public boolean isAffordable() { return true; }
	
	public static void main(String args[]) {
		Furniture f1 = new Furniture("Chair", 530, true);
		Furniture f2 = new Furniture("Table", 6000, false);
		System.out.println(f1); 
		System.out.println(f2);

	} 
}
