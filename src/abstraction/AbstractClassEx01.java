package abstraction;
/* AbstractClassEx01.java */
/* Inheriting Abstract Base class/ Abstract Member */

abstract class Animal {
	abstract  public void move();
	
	public void nonAbstractMethod()
	{
		System.out.println("Mammal::nonAbstractMethod()");
		// ...
	}
}

class Human extends Animal{

	public void move(){
		System.out.println("Human can't fly but can walk and run");
	}

	public void talk(){
		System.out.println("Human can talk");
	}

	@Override
	public void nonAbstractMethod()
	{
		System.out.println("Human::nonAbstractMethod()");
	}
}

class Bird extends Animal{

	public void move(){
		System.out.println("Birds can walk, fly, and run");
	}
	public void fly(){
		System.out.println("Birds can fly");
	}

	@Override
	public void nonAbstractMethod()
	{
		System.out.println("Bird::nonAbstractMethod()");
		// ...
	}
}

public class AbstractClassEx01{

	public static void main(String args[]){

		Animal a;
		a = new Human();
		a.move();
		
//		Bird a1 = new Object();
		Object o1 = new Bird();
		Object o2 = new Human();
		//o1.
		
		System.out.println("---------------------");
		
	
		Human h0 = new Human();   // Human reference and Human object
		// Here h0 is a Human object that references to a Human type

		Human h1 = h0;   // Human reference and Human object
		// Here h1 and h0 both reference to a Human type

		Animal h2 = new Human(); // Mammal reference and Mammal object
		// Here h2 is a Human object that references to a Mammal type

		Bird b1 = new Bird(); // Birds reference and Birds object
		// Here b1 is a Bird object that references to a Birds type

		Animal b2 = new Bird(); // Mammals reference and Birds object
		// Here h2 is a Bird object that is a reference to a Mammal type
		//Bird b3 = new Animal(); // Mammals reference and Birds object
		
		b1.move();
		b1.fly();
		b1.nonAbstractMethod();


		h1.move();
		h1.talk();
		h1.nonAbstractMethod();
		h2.move();
		// h2.talk();  //  Not allowed
		h2.nonAbstractMethod();
		b2.move();
		// b2.fly(); //  Not allowed
	}
}
