package stringConcept;

public class Substring {
	
	public void check(String s1, String s2) {
		if(s2.length()>s1.length()) {
			return;
		}
		int flag = 0;
		for(int i=0; i<= s1.length()-s2.length(); i++) {
			int j;
				for(j=0; j<s2.length(); j++) {
					if(s1.charAt(i+j) != s2.charAt(j)) {
						break;
					}
				}
			if(j==s2.length()) {
				System.out.println("yes");
				flag=1;
			}
		}
		if(flag == 0) {
			System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abhiyank";
		String sub = "bhiy";
		Substring obj = new Substring();
		obj.check(s, sub);
	}

}
