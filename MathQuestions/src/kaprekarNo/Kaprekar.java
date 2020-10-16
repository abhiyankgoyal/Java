package kaprekarNo;

// Kaprekar no. 
// - 
import java.util.Scanner;

import armstrongNo.Armstrong;

public class Kaprekar {
	
	public boolean check(int num) {
		if(num == 1) {
			return true;
		}
		int n = num*num;
		String str = Integer.toString(n); // or String.valueOf(n)
		int l=0;
		int r=0;
		for(int i=0; i<str.length()-1; i++) {
			l = Integer.parseInt(str.substring(0,i+1));
			//System.out.println(l);
			r = Integer.parseInt(str.substring(i+1,str.length()));
			//System.out.println(r);
			//System.out.println(l+r);
			if(r != 0) {
				if((l+r) == num) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Kaprekar k = new Kaprekar();
		System.out.println(k.check(num));
		for(int i = 1; i <= 100 ; i++ ) {
			if(k.check(i) == true) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
