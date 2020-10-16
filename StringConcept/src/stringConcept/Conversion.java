package stringConcept;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abhiyank goyal";
		s1 = s1.toUpperCase();
		System.out.println(s1);
		int i = 10;
		String s = Integer.toString(i);
		System.out.println(s);
		int j = Integer.parseInt(s);
		System.out.println(j);
		String str = String.valueOf(i);
		System.out.println(str);
		int k = Integer.valueOf(str);
		System.out.println(k);
		StringBuilder sb = new StringBuilder("abhiyank");
		System.out.println(sb.indexOf("k"));
		System.out.println(sb.deleteCharAt(3));
		System.out.println(sb.insert(3, "i"));
		System.out.println(s1.isEmpty());
		//sb.isEmpty(); there is no isEmpty() method in StringBuilder.
	}

}
