package generalQuestions;

//perfect no. is a positive no. which is equal to the sum of its proper divisor.

public class PerfectNumber {

	public String check(int num) {
		int sum = 0;
		for(int i=1; i<=num/2; i++) {
			if(num%i == 0) {
				sum += i;
			}
		}
		if(sum == num) {
			return "YES";
		}
		return "NO";
	}
	
	public static void main(String[] args) {
		
		PerfectNumber obj = new PerfectNumber();
		System.out.println(obj.check(1));

	}

}
