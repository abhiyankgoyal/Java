package inheritance;
/**
 * Hierarchical Inheritance:
 * 
 * 					      Animal (Parent class or super class or base class)
 * 							|
 * 							|
 * 				-------------------------
 * 				|						|
 * 			   Lion					Elephant
 * (child class or sub class 	 (child class or sub class
 * 		or derived class)				or derived class)
 * 
 * 
 * 
 **/




class Animal { // base class or super class or parent class
	private int height;
	private String color;
	
	Animal(int h, String c) {
		this.height = h;
		this.color = c;
	}
	
	public int getHeight() {
		return this.height;
	}
	public String getColor() {
		return this.color;
	}
}
class Lion extends Animal { // 'extends' keyword is used to inherit base class...it inherits data members which are not private and member functions of base class
	private int pitchSound;
	
	Lion(int h, String color, int pitchSound) {
		super(h, color);//'super' keyword is used to call constructor of the base class and it should be called 1st.
		this.pitchSound = pitchSound;
	}
	public int getPitchSound() {
		return this.pitchSound;
	}
}
class Elephant extends Animal {
	private int trunkSize;
	
	Elephant(int h, String color, int trunkSize) {
		super(h,color);
		this.trunkSize = trunkSize;
	}
	public int getTrunkSize() {
		return this.trunkSize;
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		
		Lion liObj = new Lion(12,"orange",45);
		Elephant eleObj = new Elephant(12,"grey",70);
		String colorOfLion = liObj.getColor();
		System.out.println(colorOfLion);
		System.out.println(eleObj.getHeight());
	}

}
/*
 * Elephant
 * 
 * {
 * 	int trunkSize;          
 * 	public int getHeight();   
 * public int getColor();
 * public int getTrunkSize();
 * }
 * above data members(none in this case since all are private) and member functions are inherited in the elephant class from the animal class.
 * 
 * 
 * 
 * */
