package Search;

public class LinearRecursion {
	
	public static int linear(int[] a, int val) {
		
		int left = 0;
		int right = a.length - 1;
		
		return linearHelper(a, val, left, right);
		
	}
	//{4,23,555,123,56};
	public static int linearHelper(int[] a, int val, int left, int right) {
		
		// Base case 
		if(left == right) {
			if(a[left] == val) {
				return left;
			}
			else {
				return -1;
			}
		}
		
		
		int found = linearHelper(a, val, left, right-1);

		if(found != -1) {
			return found;
		}
		else {
			if(a[right] == val) {
				return right ;
			}
			else {
				return -1;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {4,23,555,123,56};
		System.out.println(linear(arr,0));
	}

}
