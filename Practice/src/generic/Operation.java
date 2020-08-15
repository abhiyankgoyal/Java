package generic;

import java.util.ArrayList;
class Employee {
	int id;
	String name;
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
public class Operation<T,V> {
	
	T a;
	T b;
	V ac;
	
	Operation(T a, T b, V ac) {
		this.a = a;
		this.b = b;
		this.ac = ac;
	}
	
	
	public static void main(String[] args) {
		ArrayList ob = new ArrayList<>();
		ob.add(1);
		ob.add("abhiyank");
		ob.add("4.0");
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(23);
		ArrayList<Double> arr2 = new ArrayList<>();
		arr2.add(45.9);
		ArrayList<String> arr3 = new ArrayList<>();
		
		ArrayList<Employee> arr4 = new ArrayList<>();
		Employee e1 = new Employee(2, "abhiyank");
		arr4.add(e1);
		
		Operation op = new Operation(2,3.9, 67);
		Operation op1 = new Operation("mayank", "abhiyank", 78);
		
		Operation<Integer, String> op3 = new Operation<>(3,5, "abhiyank");
		
		
		StringBuilder sb = new StringBuilder();
		StringBuffer sb2 = new StringBuffer();
		String a;
		
		// string is immutable
		String str = "mayank";
		str = str + "goyal";
		str = str + " abhiyank";
		
		
		sb.append("mayank");
		sb.append("goyal");
		sb.append(" abhiyank");
		String str2 = new String(sb);
		String str3 = sb.toString();
		String str4 = String.valueOf(sb);
		System.out.println(str4);
	}

}
