package sorting;

public class bubbleSort {
	
	public void Sort(int[] a)
	{
	 int n=a.length;
	 for(int i=0;i<n-1;i++)
	 {
		 for(int j=0;j<n-i-1;j++)
		 {
			 if(a[j]>a[j+1])
			 {
				 int temp=a[j];
				 a[j]=a[j+1];
				 a[j+1]=temp;
			 }
		 }
	 }
	}

	public static void main(String[] args)
	{
		int[] arr={43,54,32,767,3,879};
		int n=arr.length;
		bubbleSort obj=new bubbleSort();
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		obj.Sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
