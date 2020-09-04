package throwKeyword;

public class ThrowKeyword {
	
	public static void age(int age) {
		if(age<18) {
			throw new ArithmeticException("Not valid");
		}
		else {
			System.out.println("valid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			age(13);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
