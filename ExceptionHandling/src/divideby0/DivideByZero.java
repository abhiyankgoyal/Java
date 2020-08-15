package divideby0;

public class DivideByZero {
	// Arithmetic Exception  - Divide by zero
	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		int c = 0;
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e + " I found an exception");
		}
		
		catch(Exception e) { //the first catch function will execute, it will not reach here
			System.out.println("exception found");
		}
		
		System.out.println(c);
		

	}

}
