package insertionSort;

public class insertionSort {
		
//		public void display(int[] a) {
//			int n= a.length;
//			for(int i=0;i<n;i++)
//			{
//				System.out.print(a[i]+ " ");
//			}
//			System.out.println();
//		}
		public void sort(int[] a)
		{
			int n=a.length;
			
			for(int i=1;i<n;i++)
			{	
				//System.out.println(i);
				for(int j=i-1;j>=0;j--)
				{
					if(a[j+1]<a[j])
					{
						// System.out.println(a[j+1]+" "+a[j]);
						
//						M-1
//						int temp = a[j];
//						a[j]=a[j+1];
//						a[j+1]=temp;
						
//						M-2						
//						a[j] = a[j]^a[j+1];
//						a[j+1] = a[j]^a[j+1];
//						a[j] = a[j]^a[j+1];
						
//						M-3
						a[j] = a[j] + a[j+1];
						a[j+1] = a[j] - a[j+1];
						a[j] = a[j] - a[j+1];
						// System.out.println(a[j+1]+" "+a[j]);
					}
					else
					{
						break;
					}
					
				}
				// display(a);
				//System.out.println(a[i]);
			}
		}

	public static void main(String[] args) {
		
		int[] arr= {10,9,8};
		
		int n=arr.length;
		
		insertionSort obj=new insertionSort();
		
		System.out.println("array before sorting: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		obj.sort(arr);
		
		System.out.println("\narray After sorting: ");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
