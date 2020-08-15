package defaultValues;
/***
 * 
 * variables do not get initialized by default inside functions(both static and non-static)
 * 
 * default values are assigned automatically to  class variables.
 * 
 * 
 * 
 * */
public class DefaultValue {	
	
	private  int c;
	private long l;
	private double a;
	private float f;
	private boolean b;
	private String str;
	private char ch;
	
	// 
	public void function2 () {
		int k=0;
		System.out.println(k);
	}
	
	public void function1() {
		int b;
		//System.out.println(b);
		//function2();
	}
	
	public static void function3() 
	{
		DefaultValue dv  = new DefaultValue();
		dv.function2();
		
		//function2();
		// cannot call directly as function3() is static function and
		//	it doesn't behave like a normal class function
	}
	
	
	public static void main(String[] args) {
		
		int a;
		//System.out.println(a);
		DefaultValue d  = new DefaultValue();
		
		//d.function2();
		
		System.out.println(d.c); //0
		System.out.println(d.l); //0
		System.out.println(d.a); //0.0
		System.out.println(d.f); //0.0
		System.out.println(d.b); //false
		System.out.println(d.str);//null
		System.out.println(d.ch); //empty
		System.out.println("Maximum value an Integer can store ((2^31)-1) "+Integer.MAX_VALUE);
		int abc = 2147483647; // 2^31-1
		
		System.out.println("Minimum value an Integer can store (-(2^31)) "+Integer.MIN_VALUE);
		
		
		System.out.println(Long.MAX_VALUE + ", " + Long.MIN_VALUE);
		long ghi = 2147483648l;
		System.out.println(ghi);
		String str = "abhiyank";
		System.out.println(str.length());
		int[] arr = {1,2,3,4,5,6};
		System.out.println(arr.length);
		
	}

}
