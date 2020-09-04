/*
 * -----------------Binary Search-----------------
 * -> array must be sorted order 
 * -> time complexity O(log(n))
 * 
 */


import java.util.Scanner;

public class BinarySearch {

	public int binary(int[] a, int k) {

		int startIndex=0;
		int endIndex=a.length -1; // i am considering the array from startIndex to endIndex
		int mid;
		while(startIndex <= endIndex)
		{
			mid=(startIndex + endIndex)/2;

			if(a[mid] == k)
			{
				return mid;
			}
			else if(k > a[mid])
			{
				startIndex = mid+1;
			}
			else
			{
				endIndex = mid-1;
			}
		}
		return -1;
	}



	public static void main(String[] args) {

		BinarySearch obj=new BinarySearch();
		int n,val;
		Scanner sc = new Scanner(System.in);
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
			System.out.print(arr[i] + " ");
		System.out.println("\nenter the value ");
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
