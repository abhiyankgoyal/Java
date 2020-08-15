package Search;

public class LinearSearch {
	
	public int search(int[] a, int n) {
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == n) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {7,3,56,12,54,96,34};
		LinearSearch obj = new LinearSearch();
		int n = 12;
		int index = obj.search(arr, n);
		if(index == -1) {
			System.out.println(n+" was not found in the array");
		}
		else {
			System.out.println(n+" is found at index: " + index);
		}
	}
}
