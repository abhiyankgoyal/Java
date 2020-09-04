/*
 *--------Linear Search--------
 * -> Time complexity: O(n)
 * 
 */
public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={3,8,6,9,5};
		int val=9;
		int flag=0;
		for(int i=0;i<=4;i++)
		{
			if(arr[i]==val)
			{
				System.out.println("value is at index: " +i);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(-1);
		}
		
	}

}
