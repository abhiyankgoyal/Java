
public class Search2 {
	
	public int LinearSearch(int[] a, int k) {
		for(int i=0;i<6;i++)
		{
			if(a[i]==k)
			{
				return i; 
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr= {4,8,1,6,3,7};
		int val=7;
		Search2 obj= new Search2();
		int res=obj.LinearSearch(arr,val);
		System.out.println(res);
		
	}

}
