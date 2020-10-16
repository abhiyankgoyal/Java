package stringConcept;

public class StringImuutability {
	// String is an immutable object
	// i.e. its value cannot be changed i.e. unmodifiable or unchangeable
	public static void main(String[] args) {
		String s1 = "mayank";
		s1 = s1 + " " + "abhiyank"; // here another object is created in scp with value "mayank abhiyank" and since this value is assigned to s1 therefore now s1 object points to new value and the previous value is eligible for garbage collector.
		s1.concat(" Goyal"); // new object is created with value "mayank abhiyank goyal" but still s1 points to object with value "mayank abhiyank" since s1 object reference is not changed.	
		System.out.println(s1);
		s1 = s1.concat(" Goyal");// now new value is assigned to s1; s1 = mayank abhiyank Goyal
		System.out.println(s1);
		
		StringBuilder sb = new StringBuilder("abcd");
		sb.append(" efgh"); // in StringBuider new object is not created. changes are made to the existing string only.
		System.out.println(sb);
	}
}
                                                                                                                                                                                                            