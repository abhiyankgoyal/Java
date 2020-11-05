package InterfaceConcept;
/*
 * With the help of interface multiple inheritance is achieved in java 
 * Interface has all member functions as abstract by default
 * All functions are public and abstract by default
 * All data members are public static and final by default
 * All data members should be initialized
 * 
 * **/
interface Animal {
	  public static final int height = 9;
	  int getHeight();
	  String getColor();
}
interface Plant {
	  int getHeight();
}
abstract class Giraffe implements Animal, Plant{
	// multiple inheritance with the help of interface
	
	public int getHeight() {
		return 5;
	}
}
class Abc extends Giraffe {
	public int getHeight() {
		return 2;
	}
	public String getColor() {
		return "Blue";
	}
}
public class InterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal obj = new Animal(); not possible
		//Animal obj = new Giraffe(); not possible
		//Animal obj = new Abc(); allowed
		//Giraffe obj2 = new Abc(); allowed
		Abc obj = new Abc();
		System.out.println(obj.getHeight());
		System.out.println(obj.getColor());
	}

}
