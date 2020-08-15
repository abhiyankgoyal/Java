package sorting;

public class selectionSort {
	
	public void sort(int[] a) {
		
		int n = a.length;
		for(int i=0; i<n-1; i++) {
			
			int minIndex = i;
			
			for(int j = i+1; j < n; j++) {
				if(a[j] < a[i]) {
					minIndex = j;
				}
			}
			int temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,3,4,1,5,7};
		
		System.out.println("array before selection sort");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		selectionSort obj = new selectionSort();
		obj.sort(arr);
		System.out.println("array after selection sort");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
