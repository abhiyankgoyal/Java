package recursion;

public class Factorial {

	public int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int prev = fact(n-1);
		return prev * n;
	}
	
	public static void main(String[] args) {
		
		Factorial obj = new Factorial();
		int res = obj.fact(5);
		System.out.println(res);
	}

}
