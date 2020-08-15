package insertionSort;

public class PassByValueAndReference {
	
	public void changea(int b) {
		b = 12;
	}
	
	public void changeArr(int[] a) {
		for(int i=0;i<a.length;i++) {
			a[i] = a[i] * 2;
		}
	}

	public static void main(String[] args) {
		int a = 20;
		PassByValueAndReference obj = new PassByValueAndReference();
		System.out.println("Before changing "+ a);
		obj.changea(a);//this is pass by value...in this copy of 'a' is transferred not original 'a'
		System.out.println("After changing "+ a);
		
		int[] arr = {1,2,3,4,5};
		System.out.println("Array before changes: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		obj.changeArr(arr);//pass by reference
		System.out.println("Array after changes: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
