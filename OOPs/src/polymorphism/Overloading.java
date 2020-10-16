package polymorphism;

// polymorphism : It is the ability for the message/data to be processed in many forms as the word itself means many + forms = many forms. 

public class Overloading { //Compile-time polymorphism (function overloading) as it occurs at compile time.
	
	/*
	 * Overloading when number of arguments are different
	 */
	
	public int add (int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	/*
	 * Overloading when types of arguments are different
	 * */
	public int area(int  l, int b) {
		return l*b;
	}
	public double area(double l, double b) {
		return l*b * 3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj = new Overloading();
		System.out.println(obj.add(2, 3));
		System.out.println(obj.add(2, 3, 4));
		
		System.out.println(obj.area(2, 3));
		System.out.println(obj.area(6.0, 8.0));

	}

}
