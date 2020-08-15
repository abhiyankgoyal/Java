package stringPractice;

import java.util.*;

public class sortingString {
	
	public static void main(String[] args) {
		
		String str1 = "327"; 
		String str2 = "238";
		String str = str1+str2;
		StringBuilder sb =  new StringBuilder(str1+str2);
		System.out.println(sb.toString());
		SortedSet<Character> ts = new TreeSet<>();
		//SortedSet<String> ts = new TreeSet<String>(); 
		for(int i=0; i<sb.length(); i++) {
			ts.add(sb.charAt(i));
		}
		System.out.println(ts);
		sb.delete(0, sb.length());
		System.out.println(sb.toString());
		for(char c: ts) {
			sb.append(c);
		}
		System.out.println(sb.toString());
		
		List<Character> al = new ArrayList<>();
		for(int m=0; m<str.length(); m++) {
			al.add(str.charAt(m));
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		StringBuilder sb2 = new StringBuilder();
		for(char s : al) {
			sb2.append(s);
		}
		System.out.println(sb2.toString());
		
		//---------------
		
		int n = 2;
		boolean prime = true;
		int i=0,j=0;
		for(i=2; i<100; i++) {
			for(j=2; j<=i/2; j++) {
				if(i%j == 0 ) {
					prime = false;
					break;
				}
			}
			if(prime == true) {
				System.out.print(i + " ");
			}
			prime = true;
		}
		
		System.out.println();
		
		int dividend = 91;
		int divisor = 17;
		int quotient = (dividend)/(divisor);
		int remainder = (dividend)%(divisor);
		System.out.println(dividend + " = " + divisor + "*" + quotient + " + " + remainder);
		
	}

}
