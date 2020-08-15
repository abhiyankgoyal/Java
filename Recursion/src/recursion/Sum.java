package recursion;

public class Sum {

	public int add(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		int prev = add(n-1);
		return n+prev;
	}
	
	
	public static void main(String[] args) {
		
		Sum obj = new Sum();
		int a = obj.add(3);
		System.out.println(a);

	}

}
