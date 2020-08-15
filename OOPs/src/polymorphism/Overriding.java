package polymorphism;
 class Animal {
	private int height;
	private int age;
	
	Animal(int height, int age) {
		this.height = height;
		this.age = age;
	}
	
	protected int getHeight() {
		return this.height;
	}
	
	public int getAge() {
		return this.age;
	}
}
// Is-A relationship (Giraffe "is a"  animal)
class Giraffe extends Animal {
	private int neckHeight;
	private String name;
	
	Giraffe(int neckHeight, String name, int height, int age) {
		super(height, age);
		this.neckHeight = neckHeight;
		this.name = name;
	}
	public int getHeight() {    // override getHeight method
		return this.neckHeight;
	}
	public String getName() {
		return this.name;
	}
}
public class Overriding {

	public static void main(String[] args) {
		
		Giraffe gf = new Giraffe(90, "Tommy", 190, 30);
		System.out.println("Giraffe gf = new Giraffe(90, \"Tommy\", 190, 30)");
		System.out.println(gf.getHeight());
		System.out.println(gf.getAge());
		System.out.println(gf.getName());
		
		
		Animal a1 = new Animal(78,4);
		System.out.println("Animal a1 = new Animal(78,4)");
		System.out.println(a1.getHeight());
		System.out.println(a1.getAge());
		
								// neckheight, name, height, age
		Animal animal = new Giraffe(90, "Tommy2", 190, 30);
		
		// here animal object is assigned an object of giraffe class (during runtime)
		// so it can only call giraffe class functions
		// but since the type is of animal class,
		// it can only call functions of giraffe class which are also in animal class and functions of animal class.
		
		// animal.getHeight()- 90
		// animal.getAge() - 30
		// animal.getName() - error since it is not in animal class.
		System.out.println("Animal animal = new Giraffe(90, \"Tommy2\", 190, 30)");
		System.out.println(animal.getHeight());
		System.out.println(animal.getAge());
		//System.out.println(animal.getName());
		
	}

}
