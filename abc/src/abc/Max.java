package abc;

public class Max {

	public static void main(String[] args) {
	
		int[] arr= { 17,67,42,2,35,20,10,15,-5,7,3,4,6};
		
		
		int count=0;
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				
				count++;
			}
			else
			{
				break;
			}
		}
		int[] b=new int[count];
		for(int i=0;i<b.length;i++)
		{
		System.out.println(b[i]);
		}
		
	}

}
