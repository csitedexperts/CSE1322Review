package abstraction_AnimalAbstractClass;

abstract class Animal {
	String name;
	int id;
	abstract  public void animalDetal(String name, int id);

}

interface   IAnimal {
	String color = "Red";

	public void animalColor();

}

class Cat extends Animal{

	@Override
	public void animalDetal(String name, int id)
	{
		this.name = name;
		this.id = id;

		System.out.println("Cat object - name: " + this.name + " id : " + this.id );
	}

}


class Dog extends Animal implements IAnimal{

	@Override
	public void animalColor()
	{

		System.out.println("Dog object - color: " + color );
	}

	@Override
	public void animalDetal(String name, int id) {
		
	}

}



public class Abstraction_AnimalAndIAnimalMain{

	public static void main(String args[]){

		Animal c = new Cat();
		
		
		c.animalDetal("Tom ", 101 );


		System.out.println("======================");
		IAnimal d = new Dog();
		d.animalColor();
	}
}

