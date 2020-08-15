
public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr= new int[6];
		arr[0]=8;
		arr[1]=12;
		arr[2]=45;
		arr[3]=54;
		arr[4]=33;
		arr[5]=21;
		System.out.println(arr.length);
		int val=33;
		int i;
		for(i=0;i<=5;i++) {
			if(arr[i]==val)
			{
				System.out.println("element found at index: " +i);
				break;
			}
		}
		if(i>5)
		{
			System.out.println(-1);
		}
	}
}
