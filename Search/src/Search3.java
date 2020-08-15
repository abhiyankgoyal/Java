
public class Search3 {

	public int LinearSearch(int[] a, int k) {
		int count=0;
		for(int i:a) // to count length of array or we can just do a.length
		{
			count++;
		}
		
		for(int i=0;i<count;i++)
		{
			if(a[i]==k)
			{
				return i; 
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] a= {4,8,1,6,3,7};
		int val=3;
		Search3 obj= new Search3();
		int res=obj.LinearSearch(a,val);
		System.out.println(res);

	}

}
