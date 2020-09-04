package exceptionHandlingWithMethodOverriding;

/*
 * 
 * 
 * If the superclass method does not declare an exception:
 * then subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
 * 
 * 
 */

//import java.io.*;

class Parent{
	
	void msg(){System.out.println("parent");}  
}  
	  
class Type1 extends Parent{
	
//	void msg()throws IOException{  // cannot declare checked exception if parent class method does not declare an exception  
//		
//		System.out.println("TestExceptionChild");  
//	}
	
	void msg() throws ArithmeticException{ // can declare unchecked exception if parent class method does not declare an exception
		System.out.println("child");
	}
	
	public static void main(String[] args){ 
		
		Parent p=new Type1();  
		p.msg();
		
	}  
}  
