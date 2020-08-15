package length;

public class ArrayLength {
	
	public int length(int[] arr)
	{
		int count=0;
		for(int n:arr)//for(each) loop
		{
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayLength obj=new ArrayLength();
		int[] arr= {2,3,4,5,6};
		System.out.println("string length is: " +obj.length(arr));
	}

}
