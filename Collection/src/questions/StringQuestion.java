package questions;

import java.util.HashSet;

public class StringQuestion {
	
	
	public static int findUniqueCharacters(String str) {
		if(str == null ||str.length() == 0 ) {
			return 0;
		}
		int count = 1;
		int repeat = 0;
		for(int i=1; i<str.length(); i++) {
			for(int j=0; j<i;j++) { 
				if(str.charAt(i) == str.charAt(j)) {
					repeat = 1;
					break;
				}
			}
			if(repeat == 0) {
				count++;
			}
			repeat = 0;
		}
		return count;
	}
	public static int findUniqueCharacters2(String str) {
		
		if(str == null) {
			return 0;
		}
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		return set.size();
	}
	/*
	 *  
	 * int[] arr = new int[26];
	 * a - z =>  
	 * 
	 * */
	public static int findUniqueCharacters3(String str) {
		if(str == null) {
			return 0;
		}
		str=str.toLowerCase();
		int count = 0;
		int[] arr = new int[26];
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			int index = ch - 'a'; // here ascii integer value of ch is stored in index
			arr[index]++;
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "abcdefghabcdefgh";
		System.out.println(findUniqueCharacters(str));
		System.out.println(findUniqueCharacters2(str));
		System.out.println(findUniqueCharacters3(str));
		int a = 4;
		char c2 = 'b';
		int b=c2 - 'a';
		char c = (char)('a'-1 + a);
		System.out.println(c + " " + b);
		
	}
	

	

}
