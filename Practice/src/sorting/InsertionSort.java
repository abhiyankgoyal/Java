package sorting;


public class InsertionSort {
	
	public void Sort(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(a[j+1]<a[j])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
				else
				{
					break;//so that it does not compare the a[j+1] with the sorted elements since if j+1 is greater than j then it will obviously greater than values before j.therefore no need to compare
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int[] arr= {9,8,7,6,5,4,3};
		InsertionSort obj=new InsertionSort();
		obj.Sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
