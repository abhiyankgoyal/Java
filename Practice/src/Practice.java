
public class Practice {
	
	public static int func(int a, int b) {
	
		int temp;
		while(b==0) {
			temp = a%b;
			a=b;
			b=temp;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=10, b=6;
			System.out.println(func(a,b));
	}

}
