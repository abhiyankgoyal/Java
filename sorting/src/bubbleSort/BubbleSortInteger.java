package bubbleSort;

public class BubbleSortInteger {
	
	public void sort(int[] a)
	{
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0; j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
//					M-1
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//					M-2
//					a[j] = a[j] + a[j+1];
//					a[j+1] = a[j] - a[j+1];
//					a[j] = a[j] - a[j+1];
//					M-3
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j]^a[j+1];
					a[j] = a[j]^a[j+1];
				}
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		BubbleSortInteger obj=new BubbleSortInteger();
		
		int arr[] ={3,60,35,2,45,320,5};  
        
        System.out.println("Array Before Bubble Sort"); 
        
        for(int i=0; i < arr.length; i++)
        {  
                System.out.print(arr[i] + " ");  
        } 
        System.out.println();
        
		obj.sort(arr);
		
		System.out.println("Array after Bubble Sort"); 
		for(int i=0; i < arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
	}
}
