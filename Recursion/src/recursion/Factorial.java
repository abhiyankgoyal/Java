package recursion;

public class Factorial {

	public long fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		long prev = fact(n-1);
		return prev * n;
	}
	
	public long fact2(int n) {
		long fact=1;
		if(n==0) {
			return 1;
		}
		for(int i=n; i>=1; i--) {
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		Factorial obj = new Factorial();
		long res = obj.fact(5);
		System.out.println(res);
		long res2 = obj.fact(6);
		System.out.println(res2);
	}

}
