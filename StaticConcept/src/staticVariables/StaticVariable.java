package staticVariables;
/*
 * 
 * -----------------Static variable-------------------
 * -Static variable can be a class variable not a local variable of any function since it is global for that class
 * -Static variable is same for every object and if once changed then it is changed for every object.
 * 
 * To access it:
 * - by creating object
 * - by classname since it is global
 * - by directly varibale name if accessing in the same class;
 * 
 */

public class StaticVariable {
	
	static int a=6; // static variable is not with every object...it is somewhere in memory from where every object takes its value.
	
	int b;
	
	public void setB(int b)
	{
		this.b=b;
		//System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	 
		 StaticVariable sv = new StaticVariable();
		 
		 System.out.println("value of static variable a  for sv object intially: "+sv.a);
		 System.out.println("value of b  for sv object intially: "+sv.b);
		 
		// sv.b = 5;
		 
		 sv.a = 9;
		 
		 sv.setB(10);
		 
		 System.out.println("value of b  for sv object after change: "+sv.b);
		 System.out.println("value of static variable a for sv object after change: "+sv.a);
		 
		 StaticVariable sv2 = new StaticVariable();
		 
		 System.out.println("value of b for sv2 object : "+sv2.b);
		 
		 System.out.println("value of static variable a for sv2 object before change: "+sv2.a);
		 
		 sv2.a = 15;
		 
		 System.out.println("value of static variable a for sv2 object before change: " + sv2.a);// all objects take the value of a from same location since a is static.
		 
		 System.out.println(sv.a); //can be called by creating object.(this is not a static way)
		 System.out.println(StaticVariable.a);//can be directly called by the class name.
		 System.out.println(a);//since a is static i.e global for that class therefore can be called directly.
		 
		 a=100;
		 
		 System.out.println(a);
		 System.out.println(sv.a);
		 System.out.println(sv2.a);
		 System.out.println(StaticVariable.a);

	}

}
