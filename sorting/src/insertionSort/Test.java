package insertionSort;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		int n;
		Scanner sc=new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("enter an integer");
		n = sc.nextInt();
		System.out.println(n);
		n = sc.nextInt();
		System.out.println(n);
		
		System.out.println("enter a string");
		s=sc2.nextLine();
		System.out.println(s);
		sc.close();
		sc2.close();
	}

}
