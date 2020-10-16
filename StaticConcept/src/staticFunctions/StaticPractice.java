package staticFunctions;

public class StaticPractice {
	
	private static int a=5;
	
	public static void m1()
	{
		System.out.println("m1 function");	
	}
	
	public static void m2()
	{
		m1(); // one static method can directly call another static method
		
		StaticPractice sp = new StaticPractice();
		
		System.out.println(a); //it is a static function therefore can call directly class static variable.
		
		System.out.println(sp.a);
		sp.a=4;
		System.out.println(a);
		//m3(); since this is a static function and we cannot call non-static function directly, inside static function.
		//sp.m3();
	}
	
	public void m3()
	{
		m1(); // we can call static function from non-static function.
		m2();
		System.out.println(a);
		a=3;
		System.out.println(a);
		m4();
	}
	
	public void m4() {
		System.out.println(a=9999);
	}

	public static void main(String[] args) {
		
		m1();
		m2();
		// m3(); since this is a static function and we cannot call non-static function directly, inside static function.
		
		StaticPractice sp = new StaticPractice();
		sp.m3();
		
		//a=3;
		System.out.println(a);
		
	}

}
