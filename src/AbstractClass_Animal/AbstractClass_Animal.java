package AbstractClass_Animal;

abstract class Animal {
	String name;
	int id;
//	abstract  public void animalDetal(String name, int id);
	abstract  public void animalDetal();
	
	public Animal(String name, int id) {
		this.name = name;
		this.id = id;
	}
}

class Cat extends Animal{
	public Cat(String name, int id) {
		super(name, id);
	}

	@Override
//	public void animalDetal(String name, int id)
	public void animalDetal()
	{
		System.out.println("Cat object - name: " + name + " id : " + id );
	}

	//System.out.println("======================");

}
public class AbstractClass_Animal{

	public static void main(String args[]){

		{
			Animal a1 = new Cat("Tom ", 101);
			Animal a2 = new Cat("Jim ", 102);

//			a1.animalDetal("Tom ", 101 );
//			a2.animalDetal("Jim ", 102 );

			a1.animalDetal();
			a2.animalDetal();

			System.out.println("======================");

		}
		
		System.out.println("======================");


	}
}