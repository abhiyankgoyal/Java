
public class QuickSort {
	
	public int partition(int[] arr,  int l, int h) {
		
		int pivot = arr[l];
		int i=l;
		int j=h;
		while(i<j) {	
			do {
				i++;
			}while(arr[i] < pivot);
			
			do{
				j--;
			}while(arr[j] > pivot);
			
			if(i<j) {
				arr[i] = arr[i] + arr[j];
				arr[j] = arr[i] - arr[j];
				arr[i] = arr[i] - arr[j];
			}
		}
			arr[l] = arr[l] + arr[j];
			arr[j] = arr[l] - arr[j];
			arr[l] = arr[l] - arr[j];
		return j;
	}
	
	public void sort(int[] arr, int l, int h) {
		
		if(l<h) {
			int pi = partition(arr, l, h);
			sort(arr, l ,pi-1);
			sort(arr, pi+1, h);
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {45,-2,345,1,56};
		QuickSort obj = new QuickSort();
		obj.sort(arr, 0,arr.length-1);
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+ " ");
		}
	}

}
