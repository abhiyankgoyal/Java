package ifElse;

public class Condition {

	public static void main(String[] args) {
		int a = 5;
		
		if(a ==5) {
			System.out.println("a value is 5");
		}
		else {
			System.out.println("a value is not 5");
		}
		
		// ternary operation (another way of if...else)
		System.out.println((a==5) ? "a value is 5" : "a value is not 5");
		
		
		
		int b= 6;
		int c;
		if(b==6) {
			c = 10;
		}
		else {
			c = 24;
		}
		System.out.println(c);
		c = 0;
		System.out.println(c);
		//same above condition can be written as:
		c = (b==6) ? 10 : 24;
		System.out.println(c);
	}

}
