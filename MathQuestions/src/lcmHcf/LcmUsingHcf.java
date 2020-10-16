package lcmHcf;

public class LcmUsingHcf {
	
	public static int lcmOfTwoNos(int a, int b) {
		int gcd = 1;
		int small = (a<b)? a : b;
		for(int i=2; i<=small; i++) {
			if(a%i == 0 && b%i == 0) {
				gcd = i;
			}
		}
		return (a*b)/gcd;
	}
	public static int gcdOfTwoNos(int a, int b) {

		int lcm = (a>b)? a : b;
		while(true) {
			if(lcm%a == 0 && lcm%b == 0) {
				break;
			}
			lcm++;
		}
		return (a*b)/lcm;
	}
	
	public static int gcdOfArray(int[] arr) {
		int gcd=arr[0];
		for(int i=0; i<arr.length; i++) {
			gcd = gcdOfTwoNos(gcd, arr[i]);
		}
		return gcd;
	}
	
	public static int lcmOfArray(int[] arr) {
		int lcm=arr[0];
		for(int i=0; i<arr.length; i++) {
			lcm = lcmOfTwoNos(lcm, arr[i]);
		}
		return lcm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lcmOfTwoNos(30, 50));
		System.out.println(gcdOfTwoNos(70, 70));
		int[] arr = {4,10,14};
		System.out.println(gcdOfArray(arr));
		System.out.println(lcmOfArray(arr));
	}

}
