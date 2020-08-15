package selectionSort;

public class sort {
			
	public void selectionSort(int[] a)
	{
		int n = a.length;
		for(int i=0;i<n-1;i++) // we need to do n-2 passes 
		{
			int min_index=i; 
			
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min_index])
				{
					min_index=j;
				}
			}
			int temp = a[i];
			a[i]=a[min_index];
			a[min_index]=temp;
		}
		
	}
	

	public static void main(String[] args) {

		int[] arr= {2,3,4,1,5,7};
		int n=arr.length;
		System.out.println("array before sorting: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("\narray after sorting: ");
		sort s = new sort();
		s.selectionSort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}

	}
}
