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
	
	public int fib2(int n) {
		if(n>=0 && n<=1) {
			return n;
		}
		int n1=0;
		int n2=1;
		int n3 = n1+n2;
		System.out.print(n1+ " " + n2 + " ");
		for(int i=2; i<=n; i++) {
			n3 = n1+n2;
			System.out.print(n3+ " ");
			n1 = n2;
			n2 = n3;
		}
		return n3;
	}

	public static void main(String[] args) {
		
		Fibonacci obj = new Fibonacci();
		int res = obj.fib(8);
		System.out.println(res);
		int res2 = obj.fib2(8); // starting from 0,1,2,3,4,5,6,7,8
		System.out.println("\n"+res2);
	}

}
