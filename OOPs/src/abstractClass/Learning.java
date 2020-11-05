package abstractClass;
/*
 * 
 *  - to make a class abstract we need  to write abstract before class name
 *  - to make function abstract we need to write abstract before function name and
 *    we also should not have body of function and the class in which abstract function is 
 *    present should also be an abstract class
 *  - Abstract function should always be implemented in derived class
 *    
 *    
 *   Things to remember
 *   - abstract class can have  0 or  more abstract functions
 *   - abstract function class must be declared abstract
 *   - abstract class cannot have an object
 * 
 * */
 abstract class Animal {
	 private int height;
	 Animal(int h){
		 this.height = h;
	 }
	public int getHeight() {
		return this.height;
	}
	public String getName() {
		return "abhiyank";
	}
	 abstract int getAge();    // abstract function (should not have body)
}
 class Giraffe extends Animal {
	 Giraffe() {
		 super(30);
	 }
	 public int getAge() {    // abstract function should always be implemented in derived class
		 return 2;
	 }
	 public int getNeckHeight() {
		 return 50;
	 }
 }
public class Learning {

	public static void main(String[] args) {
		// Animal animal = new Animal() is not possible because Animal class is abstract
		Giraffe animal1 = new Giraffe();//this will have all the data members and member function of the giraffe class and animal class which are not private.
		Animal animal2 = new Giraffe();//this will only have functions which are also in animal class and overriding function.
		System.out.println(animal1.getHeight());
		System.out.println(animal1.getNeckHeight());
		System.out.println(animal2.getHeight());
		System.out.println(animal2.getAge());
		//System.out.println(animal2.getNeckHeight());
	}

}
