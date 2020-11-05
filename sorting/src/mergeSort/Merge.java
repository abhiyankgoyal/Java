package mergeSort;

public class Merge {
	
	public void merge(int[] arr, int left, int mid, int rightEnd) {
		
		int[] a = new int[rightEnd-left+1];
		int temp = left;
		int i=0;
		int leftEnd = mid;
		int right = mid+1;
		while(left <= leftEnd && right <= rightEnd) {
			if(arr[right] <= arr[left]) {
				a[i] = arr[right];
				//i++;
				right++;
			}
			else {
				a[i]=arr[left];
				//i++;
				left++;
			}
			i++;
		}
		while(left<=leftEnd) {
			a[i]=arr[left];
			i++;
			left++;
		}
		while(right<=rightEnd) {
			a[i]=arr[right];
			i++;
			right++;
		}
		for(int num : a) {
			arr[temp]=num;
			temp++;
		}
	}
	
	public void sort(int[] arr, int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			sort(arr, l, mid);
			sort(arr, mid+1, r);
			
			merge(arr, l, mid, r);
		}
	}

	public static void main(String[] args) {
		
		//int arr[] = {10,20,30,40,5,15,35,70};
		int[] arr = {45,-2,345,1,56};
		Merge obj = new Merge();
		obj.sort(arr, 0,arr.length-1);
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+ " ");
		}
	}
	
}
