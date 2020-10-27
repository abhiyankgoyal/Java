package stringConcept;

public class StringBuilder1 {
	
//	private String s;
//	
//	StringBuilder1(String s)
//	{
//		this.s = s;
//	}
//	
//	public String getString()
//	{
//		String s = this.s.toString();
//		return s;
//	}

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("abcdefgh");
		System.out.println(sb);
		sb.append("kq"); // adds at the end
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		sb.insert(2,"2");
		System.out.println(sb);
		sb.replace(0,1, "check"); // 1 is not included, it is from 0 to less than 1
		System.out.println(sb);
		sb.delete(1,4); // 2 is not included, it is from 1 to one less than 4
		System.out.println(sb.toString()); // here StringBuilder is converted into string
		String subString = sb.substring(4,8);
		System.out.println(subString);
		StringBuffer sbf = new StringBuffer("hello");
		sbf.append(" world");
		System.out.println(sbf);
        System.out.println(sb.substring(1,5));
        StringBuilder sb2 = new StringBuilder("abc dflhsl");
        System.out.println(sb2);
        String s = "ndfj jdvdj";
        System.out.println(s);
	}

}
