package stringConcept;

import java.util.*;

public class Anagram {
	
	public String checkAnagram(String s1, String s2) {
		
		if(s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0 || s1.length() != s2.length()) {
			return "NO";
		}
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		System.out.println(s1);
		if(s1.equals(s2)) {
			return "YES";
		}
		else {
			Map<Character, Integer> hm = new HashMap<>();
			for(int i=0; i<s1.length(); i++) {
				if(hm.containsKey(s1.charAt(i))) {
					hm.put(s1.charAt(i), hm.get(s1.charAt(i)) + 1);
				}
				else {
					hm.put(s1.charAt(i), 1);
				}
			}
			for(int i=0; i<s2.length(); i++) {
				if(!hm.containsKey(s2.charAt(i))) {
					return "NO";
				}
				else {
					hm.put(s2.charAt(i), hm.get(s2.charAt(i)) - 1);
					if(hm.get(s2.charAt(i)) < 0) {
						return "NO";
					}
				}
			}
			return "YES";
		}
		
		//method 2 doubt for space
//		else {
//			int[] arr = new int[26];
//			int index = 0;
//			for(int i=0; i<s1.length(); i++) {
//				index = s1.charAt(i) - 'a';
//				arr[index]++; 
//			}
//			for(int i=0; i<s2.length(); i++) {
//				index = s2.charAt(i) - 'a';
//				arr[index]--;
//				if(arr[index] < 0) {
//					return "NO";
//				}
//			}
//			return "YES";
//		}
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(s1 + " " + s2);
		Anagram obj = new Anagram();
		System.out.println(obj.checkAnagram(s1, s2));
		sc.close();
	}

}
