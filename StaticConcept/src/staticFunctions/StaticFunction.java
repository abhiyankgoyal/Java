package staticFunctions;
/*
 * 
 * -----------------Static function--------------------
 * - it does not behave as a normal function of class
 * - you can use class static variable in static method directly.
 * - you cannot directly access class variable(non-static) inside class static method.
 * - to use a variable you need to create an object.
 * - non-static function cannot make a call to static function directly. by creating object of class we can do the same.
 * 
 *  To access static function:
 * - by creating object
 * - by calling function name directly if in same class 
 * - by using classname
 * 
 */
class Student{
	
	static int a=12;
	
	public static void studentM1()
	{
		System.out.println("student m1");
	}
	public static void abc() {
		studentM1();
	}

}
public class StaticFunction {
	
	public static void m1() {
		
		System.out.println("m1 function");
	}
	
	public static void main(String[] args) {
		
		StaticFunction sf = new StaticFunction();
		sf.m1();
		StaticFunction.m1();
		m1();
		
		Student s1 = new Student();
		s1.studentM1();
		Student.studentM1();
		//studentM1(); not allowed
		//Student.abc(); not allowed
		s1.abc();
	}

}
