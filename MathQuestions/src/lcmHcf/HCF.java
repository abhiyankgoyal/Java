package lcmHcf;

public class HCF {

	public static int gcdOfTwoNos(int a, int b) {
		
		int gcd=1;
		int small = (a<b)? a : b;
		for(int i=2; i<=small; i++) {
			if(a%i==0 && b%i==0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcdOfTwoNos(80, 100));
	}

}
