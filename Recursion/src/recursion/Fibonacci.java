package recursion;

public class Fibonacci {
	
	public int fib(int n)
	{
		if(n <= 1) // if first index is taken as 0th index
		//if(n <= 2)  if first index is taken as 1th index
		{
			return n;
		}
		int prev = fib(n-1) + fib(n-2);
		return prev;
	}

	public static void main(String[] args) {
		
		Fibonacci obj = new Fibonacci();
		int res = obj.fib(8);
		System.out.println(res);
	}

}
