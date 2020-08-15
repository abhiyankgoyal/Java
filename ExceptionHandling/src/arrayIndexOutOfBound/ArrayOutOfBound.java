package arrayIndexOutOfBound;

// Array Index Out of Bounds exception
public class ArrayOutOfBound {

	public static void main(String[] args) {
		int[] arr = new int[15];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
		}
		try{
			System.out.println(arr[15]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e + " exception found" );
		}
	}

}
