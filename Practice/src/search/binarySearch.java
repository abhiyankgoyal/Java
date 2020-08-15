package search;

public class binarySearch {
	
	public int Search(int[] arr,int key) {
		
		int n=arr.length;
		int s=0;
		int e=n-1;
		
		while(s<=e)
		{
			int mid=(s+e)/2;
				if(arr[mid]==key)
				{
					return mid;
				}
				else if(arr[mid]<key)
				{
					s=mid + 1;
				}
				else
				{
					e=mid-1;
				}
		}
		return -1;
		
		
		
		
	}

	public static void main(String[] args) {
		int[] a= {40,68,78,123,321,461,785};// array must be sorted.
		int key=78;
		linearSearch obj=new linearSearch();
		int res=obj.Search(a,key);
		if(res==-1)
		{
			System.out.println("sorry " + key+" is not found in the array");
		}
		else
		{
			System.out.println(key+" is found at index " + res);
		}
	}

}


