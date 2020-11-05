package stringConcept;

public class reverse {

	public static void main(String[] args) {

		String s = "abhiyank";
		
		/*since String is immutable therefore cannot be changed in the given string
		therefore need to create new string
		*/
		
		//m-1 (not recommended because uses more memory)
		String s2 = "";
		for(int i=s.length()-1; i>=0; i--) {
			s2 += s.charAt(i); 
		}
		System.out.println(s2);
		
		//m-2 (recommended)
		String s3 = "mayank";
		char[] sarr = s3.toCharArray();
		int i=0;
		int j=s3.length()-1;
		char temp;
		while(i<j) {
			temp = sarr[i];
			sarr[i] = sarr[j];
			sarr[j] = temp;
			i++;
			j--;
		}
		String s4 = String.valueOf(sarr);
		System.out.println(s4);
		
		//m-3
		String s5 = "suresh";
		StringBuilder sb = new StringBuilder(s5);
		sb.reverse();
		System.out.println(sb);
		
		//m-4
		String s6 = "alekha";
		StringBuilder sb2 = new StringBuilder();
		for(int m=s6.length()-1; m>=0; m--) {
			sb2.append(s6.charAt(m));
		}
		s6 = sb2.toString();
		System.out.println(s6);
	}

}
