package generalQuestions;

import java.lang.Math;

public class PerfectSquare {
	
	public String check(int num) {
		
//		double sqrt = Math.sqrt(num);
//		if(sqrt == (int)(Math.sqrt(num))) {
//			return "YES";
//		}
//		return "NO";
		
//		Method-2
		if(num == 0) {
			return "YES";
		}
		for(int i=1; i*i<=num; i++) {
			if((num%i == 0) && (num/i == i)) {
				return "YES";
			}
		}
		return "NO";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectSquare obj = new PerfectSquare();
		System.out.println(obj.check(0));
	}

}
