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
		
		StringBuilder sb = new StringBuilder("abc");
		
		sb.append("kq"); // adds at the end
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		sb.insert(2,"2");
		System.out.println(sb);
		sb.replace(0,1, "check"); // 1 is not included, it is from 0 to less than 1
		System.out.println(sb);
		sb.delete(1,4); // 2 is not included, it is from 1 to less than 4
		System.out.println(sb.toString()); // here StringBuilder is converted into string
		
		StringBuffer sbf = new StringBuffer("hello");
		sbf.append(" world");
		System.out.println(sbf);
        
        //StringBuilder1 sb = new StringBuilder1("abc");

	}

}
