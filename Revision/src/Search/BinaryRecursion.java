package Search;

public class BinaryRecursion {
	
	public static int search(int[]a , int val) {
		if(a.length == 0) {
			return -1;
		}
		int left = 0;
		int right = a.length - 1;
		
		return searchSmall(a, val, left, right);
	}
	
	public static int searchSmall(int[] a, int val, int left, int right) {
		
		if(left == right) {
			if(a[left] == val) {
				return left;
			}
			else {
				return -1;
			}
		}
		int mid = (left + right)/2;
		if(a[mid] == val) {
			return mid;
		}
		else if(val < a[mid]) {
			return searchSmall(a, val, left, mid-1);
		}
		else {
			return searchSmall(a, val, mid+1, right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		System.out.println(search(arr, 3));
	}
}
