

package stringConcept;
import java.util.Scanner;

public class SentenceReverse {
	
	public String reverseTypeOne(String str) {
		String[] strArr = str.split(" ");
		StringBuilder sb = new StringBuilder("");
		for(int i=strArr.length-1; i>=0; i--) {
			sb.append(strArr[i]);
			sb.append(" ");
		}
		return sb.toString();
//		String[] words = str.split(" ");
//        
//        String outputString = "";
//         
//        for (int i = words.length-1; i >= 0; i--)
//        {
//            outputString = outputString + words[i] + " ";
//        }
//         
//        return outputString;
		
	}
	
	public String reverseTypeTwo(String str) {
		
		String[] strArr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<strArr.length; i++) {
			strArr[i] = reverse(strArr[i]);
		}
		for(int i=strArr.length-1; i>=0; i--) {
			sb.append(strArr[i]);
			sb.append(" ");
		}
		return sb.toString();
	}
	
	public String reverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	
	public String reverseTypeThree(String s) {
		
		String[] strArr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<strArr.length; i++) {
			strArr[i] = reverse(strArr[i]);
			sb.append(strArr[i]);
			sb.append(" ");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence:");
		String str = sc.nextLine();
		System.out.println(str);
		SentenceReverse ob = new SentenceReverse();
		String rev = ob.reverseTypeOne(str);
		System.out.println(rev);
		
		String rev2 = ob.reverseTypeTwo(str);
		System.out.println(rev2);
		
		String rev3 = ob.reverseTypeThree(str);
		System.out.println(rev3);
		
		String rev4 = ob.reverse(str);
		System.out.println(rev4);
		sc.close();
	}

}
