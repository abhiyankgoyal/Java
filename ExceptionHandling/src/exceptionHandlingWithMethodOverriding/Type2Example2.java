package exceptionHandlingWithMethodOverriding;

class Parent3{  
	
	void msg()throws Exception{
		  System.out.println("parent");
	}
	
	void msg2() {
		System.out.println("parent2");
	}
}

public class Type2Example2 extends Parent3{
	
	Type2Example2(){
		super();
	}
	
	void msg()throws ArithmeticException{
		  System.out.println("child");
	} 
	
	void msg2() {
		System.out.println("child2");
	}

	public static void main(String[] args) {
		
		Parent3 p = new Type2Example2();
		try {
			p.msg();
		}
		catch(Exception e) {}
		
		try {
			p.msg2();
		}
		catch(Exception e){}
	}

}
