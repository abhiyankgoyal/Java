package recursion;

public class Testing {
	
	public static void recursion(int n) {
		if(n == 1) {
			System.out.println(n);
		}
		else {
			n = n-1;
			recursion(n);
			System.out.println(n);
		}
	}
	
	
	public static void changenew(int a) 
	{
		System.out.println(a);
	}
	public static void change(int a) {
		a = 10;
		
		changenew(a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		recursion(4);
//		int a = 999;
//		a = a-1;
//		change(a);
//		System.out.println(a);

	}

}
