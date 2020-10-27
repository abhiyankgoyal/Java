import java.util.Scanner;
public class Search3 {

	public int LinearSearch(int[] a, int k) {
		int count=0;
		for(int i:a) // to count length of array with the help of for each loop or we can just do a.length
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
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[6];
		int i;
		for(i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(sc.next()); // accepting the input in string and then converting it in integer.
		}
		int val = Integer.parseInt(sc.next());
		
		//int[] a= {4,8,1,6,3,7};
		//int val=3;
		Search3 obj= new Search3();
		int res=obj.LinearSearch(a,val);
		System.out.println(res);
		
		String s = sc.next();
		String[] f = s.split(",");
		int[] g = new int[f.length];
		for(int j=0; j<f.length; j++) {
			g[j] = Integer.parseInt(f[j]);
			System.out.print(g[j] + " ");
		}
		sc.close();
	}

}
