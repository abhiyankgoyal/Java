package mergeSort;

public class Merge {
	
	public void sortTwoHalf(int[] arr, int left, int leftEnd, int right, int rightEnd) {
		
		int[] a = new int[rightEnd-left+1];
		int temp = left;
		int i=0;
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

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,5,15,35,70};
		Merge obj = new Merge();
		obj.sortTwoHalf(arr, 0,3,4,7);
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+ " ");
		}
	}
	
}
