package stringConcept;

public class StringImuutability {
	// String is an immutable object
	// i.e. its value cannot be changed i.e. unmodifiable or unchangeable
	public static void main(String[] args) {
		String s1 = "mayank";
		s1 = s1 + "  " + "abhiyank"; // here another object is created in scp with value "mayank abhiyank" and since this value is assigned ro s1 therefore now s1 object points to new value.
		s1.concat(" Goyal"); // new object is created with value "mayank abhiyank goyal" but still s1 points to object with value "mayank abhiyank" 		
		System.out.println(s1);
	}

}
                                                                                                                                                                                                            