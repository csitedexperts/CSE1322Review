package abstraction_AnimalAbstractClass;

abstract class Animal {
	String name;
	int id;
	abstract  public void animalDetal(String name, int id);
	
	public void animalColor() {
		
	}
	abstract  public void animalDetal();

	public Animal() {
		
	}

	public Animal(String name, int id) {
		this.name = name;
		this.id = id;
	}

}

	interface   IAnimal {
		String color = "Red";

		public void animalColor();

	}



class Cat extends Animal{

	public Cat(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void animalDetal(String name, int id)
	{
		this.name = name;
		this.id = id;

		System.out.println("Cat object - name: " + this.name + " id : " + this.id );
	}

	@Override
	public void animalDetal() {
		System.out.println("Cat object - name: " + this.name + " id : " + this.id );

	}

}


class Dog extends Animal implements IAnimal{

	public Dog(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void animalColor()
	{
		System.out.print("Dog object - color: ");
		
		System.out.println(color );
	}

	@Override
	public void animalDetal(String name, int id) {

	}

	@Override
	public void animalDetal() {
		System.out.println("Cat object - name: " + this.name + " id : " + this.id );

	}

}



public class Abstraction_AnimalAndIAnimalMain{

	public static void main(String args[]){

		Animal c = new Cat("Tom", 101);

		c.animalDetal();

		c.animalDetal("Tommy ", 1010 );
	
		System.out.println("======================");
		IAnimal d = new Dog("Dog", 102);
		d.animalColor();

	}

}


