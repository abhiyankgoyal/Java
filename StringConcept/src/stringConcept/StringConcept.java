package stringConcept;

public class StringConcept {

	public static void main(String[] args) {
		String str="Hello World";
		//String str2 = new String("hello");
		System.out.println(str);
		//printing length of string
		System.out.println(str.length());//remember to put bracket in str.length() since it is not an array.
		
		char[] ch = new char[str.length()];
		ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+",");
		}
		System.out.println();
		
		
		String s1 = new String("abhiyank"); //one object in heap and one object in scp and s1 will point to heap object
		String s2 = new String("abhiyank"); // one object in heap, no new object in scp and will point to the object created in heap
		
		if(s1==s2) // 2 different objects are compared in heap
		{
			System.out.println("same 1 and 2");
		}
		else {
			System.out.println("not same 1 and 2");
		}
		
		String s3 = "abhiyank"; // creates s3 object in scp and will point to scp object
		String s4 = "abhiyank"; // checks and does not create object since object with same value already exists therefore points to s3 object in scp
		if(s3 == s4) { // compares same object in scp therefore same
			System.out.println("same s3 and s4");
		}
		else {
			System.out.println("not same  s3 and s4");
		}
		
		if(s1 == s3) { // compares objects from different heap and scp therefore cannot be same
			System.out.println("same s1 and s3");
		}
		else {
			System.out.println("not same  s1 and s3");
		}
		
		String ss1 = new String("mayankgoyal");
		String ss2 = "mayankgoyal";
		if(ss1 == ss2) {
			System.out.println("same ss1 and ss2");
		}
		else {
			System.out.println("not same ss1 and ss2");
		}
		
		String st = new String("hello how r you");
		for(int i=0;i<st.length();i++) {
			System.out.println(st.charAt(i));
		}
		//System.out.println(st.charAt(st.length())); will give error StringIndexOutOfBoundsException
	}
		//string is immutable i.e. cannot be changed...to prevent immutability, StringBuilder and StringBuffer are used.
}
