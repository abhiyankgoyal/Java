package exceptionHandlingWithMethodOverriding;

/*
 * 
 * If the superclass method declares an exception:
 * then subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
 * 
 */

class Parent2{
	
	void msg()throws ArithmeticException{
		
		System.out.println("parent");
	}  
}

public class Type2 extends Parent2{
	
//	void msg()throws Exception{  // since superclass method declares exception therfore here same or subclass or no exception can only be declared
//		
//		System.out.println("child");
//	}   
	
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String[] args) {
		
		Parent2 p = new Type2();
		p.msg();
	}

}


