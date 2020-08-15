package nullPointerException;

// null pointer exception
public class NullPointerExceptionPratice {

	public static void main(String[] args) {
		String s = "abhiyank";
		String  k = null;
		System.out.println(s);
		try {
			System.out.println(k.length());
		}
		catch(NullPointerException e) {
			System.out.println(e + " found");
		}
	}

}
