package Search;

public class BinarySearch {
	
	public int BS(int[] a, int val) {
		
		int sI = 0;
		int eI = a.length - 1;
		int mid;
		while(sI <= eI) {
			mid = (sI + eI)/2;
			if(a[mid] == val) {
				return mid;
			}
			else if(val < a[mid]) {
				eI = mid - 1;
			}
			else {
				sI = mid + 1 ;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int val = 1;
		BinarySearch obj = new BinarySearch();
		int res = obj.BS(arr, val);
		System.out.println(res);
	}
}
