package stringConcept;

public class Validation {

	public String check(String s) {
		
		if(s.length() == 0) {
			return "NO";
		}
		for(int i=0; i<s.length(); i++) {
			if(!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') && !(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') && !(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
				return "YES";
			}
		}
		return "NO";
	}
	public static void main(String[] args) {
		
		String s = " ";
		Validation obj = new Validation();
		System.out.println(obj.check(s));
	}

}
