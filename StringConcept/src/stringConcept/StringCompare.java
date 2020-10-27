package stringConcept;

public class StringCompare {

	public static void main(String[] args) {
		
		String s1 = new String("abhiyank");
		String s2 = new String("abhiyank");
		// here we are comparing objects
		if(s1 == s2) {
		System.out.println("same object s1 & s2");	
		}
		else {
			System.out.println("not same object s1 & s2");
		}
		
		// here we will compare value for those objects
		if(s1.equals(s2)) {
			System.out.println("value for both s1 and s2 are same");
		}
		else {
			System.out.println("values for both s1 and s2 are different");
		}
		
		// another approach to compare values
		if(s1.compareTo(s2) == 0) {
			System.out.println("value for both s1 and s2 are same");
		}
		else {
			System.out.println("values for both s1 and s2 are different");
		}
		
		
		String s3 = new String("abcd");
		String s4 = new String("abd");
		if(s3.compareTo(s4) == 0) {
			System.out.println("value for both s1 and s2 are same");
		}
		else if(s3.compareTo(s4) < 0) {
			System.out.println("values for both s1 and s2 are different 1st else if");
		}
		else {
			System.out.println("values for both s1 and s2 are different 2nd else");
		}
		
		String s5 = "mnop";
		String s6 = "mnop";
		if(s5 == s6) {
			System.out.println("s5 and s6 are same");
		}
		else {
			System.out.println("s5 and s6 are not same");
		}
		
		/*
		 * In s1.compareTo(s2)
		 * if s1 is greator than s2 then it will return > 0,
		 * if s1 is same value as s2 it will return 0;
		 * if s1 is smaller than s2 it will return < 0
		 * */
	}

}
