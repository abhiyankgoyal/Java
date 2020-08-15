package search;

public class linearSearch {
	
	public int Search(int[] arr,int k)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==k)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a= {7,3,4,8,5,1,78,43,65};
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
