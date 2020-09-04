package exceptionPropagation;

public class ExceptionPropagationExample {
	
	public void p() {
		int a=50/0; // unchecked exception hence can be propagated
	}
	
	public void n() {
		p();
	}
	
	public void m(){
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("exception handled");
		}
	}

	public void x() {
		//throw new java.io.IOException("device error");  checked exception hence cannot be propagated without throws keyword with method signature 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropagationExample obj = new ExceptionPropagationExample();
		obj.m();
		System.out.println("rest of the code");
		
		try {
			obj.x();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			obj.n();
		}
		catch(Exception e) {
			System.out.println("exception handled");
		}
	}

}
