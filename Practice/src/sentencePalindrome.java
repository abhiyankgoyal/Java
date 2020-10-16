import java.util.Scanner;
import java.util.*;
public class sentencePalindrome {
	
	public String checkPalindrome(String sentence) {
		// Method-1
//		char ch;
//		List<Character> al = new ArrayList<>();
//		for(int i=0; i<sentence.length(); i++) {
//			ch = sentence.charAt(i);
//			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
//				ch = Character.toLowerCase(ch);
//				al.add(ch);
//			}
//		}
//		System.out.println(al);
//		int i=0;
//		int j=al.size()-1;
//		while(i<j) {
//			if(al.get(i) != al.get(j)) {
//				return "NO";
//			}
//			i++;
//			j--;
//		}
//		return "YES";
		
		// Method-2
		int i=0;
		int j=sentence.length()-1;
		char chI, chJ;
		while(i<j) {
			chI = sentence.charAt(i);
			chJ = sentence.charAt(j);
			while(!((chI >= 'a' && chI <= 'z') || (chI >= 'A' && chI <= 'Z') || (chI >= '0' && chI <= '9'))) {
				System.out.println(chI);
				i++;
				if(i==j) {
					return "YES";
				}
				chI = sentence.charAt(i);
			}
			while(!((chJ >= 'a' && chJ <= 'z') || (chJ >= 'A' && chJ <= 'Z') || (chJ >= '0' && chJ <= '9'))) {
				System.out.println(chJ);
				j--;
				if(j==i) {
					return "YES";
				}
				chJ = sentence.charAt(j);
			}
			if(chI != chJ) {
				return "NO";
			}
			i++;
			j--;
		
		}
		return "YES";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		String sentence = sc.nextLine();
		sentencePalindrome obj = new sentencePalindrome();
		System.out.println(obj.checkPalindrome(sentence));
		sc.close();
	}

}
