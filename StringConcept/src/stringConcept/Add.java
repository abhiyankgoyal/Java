package stringConcept;

public class Add {

	public static void main(String[] args) {
		
		String s1 = "abhiyank";
		String s2 = "Mayank";
		System.out.println(s1.concat(s2));
		
		StringBuilder sb = new StringBuilder(s1);
		sb.append(s2);
		System.out.println(sb.toString());
		
		char[] c = new char[s1.length() + s2.length()];
		for(int i=0; i<s1.length(); i++) {
			c[i] = s1.charAt(i);
		}
		System.out.println(String.valueOf(c));
		int j=0;
		for(int i=s1.length(); i<(s1.length()+s2.length()); i++) {
			c[i] = s2.charAt(j);
			j++;
		}
		System.out.println(String.valueOf(c));
		
		String s = null;
		System.out.println(s);
	}

}
