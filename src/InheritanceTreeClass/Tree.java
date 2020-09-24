package InheritanceTreeClass;

class Tree{
	public String name; 
	public int height; 
	private boolean isWild;
	
	public Tree() {  } 
	public Tree(String name, int height, boolean isWild) {
		this.name = name; 
		this.height = height;
		this.isWild = isWild; 
	} 
	public void setisWild(boolean isWild) { 
		this.isWild = isWild; 
		} 
	
	public boolean getisWild() { 
		return isWild; 
		} 
	
	@Override
	public String toString() { 
		return "Name: " + name + " Height: " + height + " isWild: " + isWild; 
	} 

	public boolean isUseful() { return true; }
	
	public static void main(String args[]) {
		Tree t1 = new Tree("Red Oak", 53, false);
		Tree t2 = new Tree("Mehgony", 63, true);
		System.out.println(t1); 
		System.out.println(t2);

	} 
}
