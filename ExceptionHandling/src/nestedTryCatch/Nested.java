package nestedTryCatch;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=0;
		int c = 0;
		try {
			try {
				c=a/b;
			}
			catch(ArithmeticException e) {
				System.out.println(e + " I found an exception");
			}
			try {
				String s=null;
				System.out.println(s.length());
			}
			catch(NullPointerException e) {
				System.out.println(e + " exception found");
			}
			System.out.println("this statement executed because exception is handled");
		}
		catch(Exception e) {
			System.out.println("exception handled");
		}
		
	}

}
