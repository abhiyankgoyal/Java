import java.util.Scanner;

public class BinarySearch {

	public int binary(int[] a, int k) {

		int startindex=0;
		int endindex=a.length -1; // i am considering the array from startindex to endindex

		while(startindex <= endindex)
		{
			int mid=(startindex + endindex)/2;

			if(a[mid]==k)
			{
				return mid;
			}
			else if(a[mid]<k)
			{
				startindex=mid+1;
			}
			else
			{
				endindex=mid-1;
			}
		}
		return -1;
	}



	public static void main(String[] args) {

		BinarySearch obj=new BinarySearch();
		int n,val;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elemets in the array");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements in the increasing order");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array is: ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		System.out.println("enter the value ");
		val=sc.nextInt();
		int res=obj.binary(arr,val);
		if(res==-1)
		{
			System.out.println("element not found in the array");
		}
		else
		{
			System.out.println(val+" is at index "+res);
		}
		sc.close();

	}

}
