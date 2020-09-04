package customException;

class InvalidAgeException extends Exception{ 
	
	 InvalidAgeException(String s){
	  super(s);
	 }  
}  

public class TestCustomException {
	
	void validate(int age) throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("Not valid");
		}
		else {
			System.out.println("vaild");
		}
	}

	public static void main(String[] args) {
		
		TestCustomException obj = new TestCustomException();
		try {
			obj.validate(13);
		}
		catch(Exception e) {
			System.out.println("exception occured: " +e);
		}
		System.out.println("rest of the code...");  
	}

}
