package finallyMethod;

public class Finally {
	public static void main(String[] args) {
		int a=1,b=0;
		try {
			int c=a/b;
		}
//		catch(Exception e){
//			System.out.println(e);
//		}
		finally {
			System.out.println("finally block is always executed");
		}
	}
}
