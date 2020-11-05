package questions;

public class primeNos {
	
	public static void printPrimeNos(int n) {
		int prime = 0;
		if(n<=1) {
			System.out.println("No Prime no.");
			return;
		}
		if(n>=2) {
			for(int i=2; i<n; i++) {
				for(int j=2; j*j<=i; j++) {
					if(i%j == 0) {
						prime = 1;
						break;
					}
				}
				if(prime == 0 ) {
					System.out.print(i + " ");
				}
				else {
					prime = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int n=50;
		printPrimeNos(100);
		
	}
}
