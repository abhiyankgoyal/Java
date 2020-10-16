package Search;

public class LinearSearch {
	
	public int search(int[] a, int ele) {
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == ele) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {35,43,12,67,78};
		LinearSearch ls = new LinearSearch();
		System.out.println(ls.search(arr, 54));
		
	}
}
