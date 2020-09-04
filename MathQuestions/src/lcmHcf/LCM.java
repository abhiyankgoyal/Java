package lcmHcf;

public class LCM {

	public static int lcmOfTwoNos(int n1, int n2) {
		int lcm;
		if(n1==n2) {
			return n1;
		}
		lcm = (n1>n2)? n1:n2;
		while(true) {
			if(lcm%n1 == 0 && lcm%n2 == 0) {
				break;
			}
			lcm++;
		}
		return lcm;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		int b=37;
		System.out.println(lcmOfTwoNos(a,b));
	}

}
