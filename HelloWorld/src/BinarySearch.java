
import java.util.Scanner;

public class BinarySearch {
	
	public int binarySearch(int a[], int n, int key) {
		
				int low=0;
				int high=n-1;
				
				while(low<=high)
				{	
					int mid=(low+high)/2;
				
					if(a[mid]==key)
					{
						return mid;
					}
					else if(key<=a[mid])
					{
						low=low+1;
					}
					else
					{
						high=high+1;
					}
				}
				return -1;
		}

	public static void main(String[] args) {
	
		BinarySearch ob= new BinarySearch();
		
		int n;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter the no. of elemets in array");
		
		n=s.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter the elements of sorted array ");
		
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("array is ");
		
		for(int i=0; i<n;i++) 
		{
			
			System.out.print(arr[i] + " ");
		}
		
		int key;
		
		System.out.println("enter the key");
		key=s.nextInt();
		
		int res=ob.binarySearch(arr, n, key);
		if(res==-1)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("element found at index: "+res);
		}
		s.close();
	}
}
			
