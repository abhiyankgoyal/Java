import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int j = sc.nextInt();
		int m = sc.nextInt();
		int p = sc.nextInt();
		int count=0;
		for(int i=n; i>=1 ;i++) {
			if(m>0) {
				m=m-k;
				count++;
			}
			else if(p>0){
				p=p-j;
				count++;
			}
			else {
				break;
			}
		}
		int monkeyLeft = n - count;
		//int monkeyLeft = n - m/k - p/j;
		System.out.println("Number of Monkeys left on the Tree:" + monkeyLeft);
	}

}
