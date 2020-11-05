import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
	
	public boolean armstrongNum(int n) {
		
		int sum=0;
		int digit;
		int num = n;
		while(n>0) {
			digit = n%10;
			//sum += digit^3;
			sum += Math.pow(digit, 3);
			n /= 10;
		}
		if(sum == num) {
			return true;
		}
		return false;
	}
	
	public boolean perfectNum(int n) {
		
		if(n <= 0) {
			return false;
		}
		int i=1;
		int sum=0;
		for(i=1; i<=n/2; i++) {
			if(n%i == 0) {
				sum += i;
			}
		}
		if(sum == n) {
			return true;
		}
		return false;
	}
	
	public int lcm(int num1, int num2) {
		
		if(num1 == num2) {
			return num1;
		}
		//int largeNum = Math.max(num1, num2);
		int largeNum = (num1 > num2)? num1 : num2;
		while(true) {
			if(largeNum%num1 == 0 && largeNum%num2 == 0) {
				return largeNum;
			}
			largeNum++;
		}
	}
	
	public int hcf(int num1, int num2) {
		if(num1 == num2) {
			return num1;
		}
		int small = Math.min(num1, num2);
		int hcf = 1;
		for(int i=2; i<=small; i++) {
			if(num1%i == 0 && num2%i == 0) {
				hcf = i;
			}
		}
		return hcf;
	}
	
	public boolean perfectSquare(int n) {
		if(n<0) {
			return false;
		}
		if(n == 0) {
			return true;
		}
		for(int i=1; i*i<=n; i++) {
			if(n/i == i && n%i == 0) {
				return true;
			}
		}
		return false;
	}
	
	public boolean prime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i=2; i*i<num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int largest(int a, int b, int c) {
		
		if(a>b) {
			return (a>c)? a:c;
		}
		else {
			return (b>c)? b:c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number to check whether it is armstrong or not:");
//		int num = sc.nextInt();
		Armstrong obj = new Armstrong();
//		System.out.println(obj.armstrongNum(num));
//		System.out.println("Enter a number to check whether it is perfect number or not:");
//		int num2 = sc.nextInt();
//		System.out.println(obj.perfectNum(num2));
//		System.out.println(obj.lcm(12,16));
//		System.out.println(obj.hcf(12,24));
//		System.out.println("Enter a number to check whether it is perfect square or not:");
//		int num3 = sc.nextInt();
//		System.out.println(obj.perfectSquare(num3));
//		System.out.println("Enter a number to check whether it is prime or not:");
//		int num4 = sc.nextInt();
//		System.out.println(obj.prime(num4));
		System.out.println(obj.largest(99,100,98));
		sc.close();
	}

}
