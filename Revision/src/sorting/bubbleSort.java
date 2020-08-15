package sorting;

public class bubbleSort {
	
	public void sort(int[] a) {
		
		int n=a.length;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {9,8,7,6,5,4,3};
		System.out.println("array before sorting");
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		bubbleSort obj = new bubbleSort();
		obj.sort(arr);
		System.out.println("\narray after sorting");
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
