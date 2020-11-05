package armstrongNo;

// Armstrong no.
// - a no. which is equal to the sum of the cubes of its digits

import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
	
	public String check(int num) {
		int digit;
		int sum=0;
		int n = num;
		while(num>0) {
			digit = num%10;
			//sum += digit*digit*digit;
			sum += Math.pow(digit, 3);
			num /= 10;
		}
		//System.out.println(sum);
		if(sum == n) {
			return "YES";
		}
		return "NO";
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Armstrong a = new Armstrong();
		System.out.println(a.check(num));

	}

}

