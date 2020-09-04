import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr2 = new int[6];
		for(int i=0; i< arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 + " " + num2);
		int[] arr= new int[6]; // creating array with the help of 'new' keyword
		arr[0]=8;
		arr[1]=12;
		arr[2]=45;
		arr[3]=54;
		arr[4]=33;
		arr[5]=21;
		System.out.println(arr.length);
		int val=33;
		int flag=0;
		for(int i=0;i<=5;i++) {
			if(arr[i]==val)
			{
				System.out.println("element found at index: " +i);
				flag=1;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println(-1);
		}
		sc.close();
	}
}
