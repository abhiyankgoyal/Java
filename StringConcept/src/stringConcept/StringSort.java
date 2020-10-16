package stringConcept;

public class StringSort {
	
	public void insertionSort(String[] stra)
	{
		
		int n = stra.length;
		
		for(int i=1; i<n; i++)
		{
			for(int j=i-1; j>=0; j--)
			{
				if(stra[j+1].compareTo(stra[j]) < 0)
				{
					String temp = stra[j+1];
					stra[j+1] = stra[j];
					stra[j] = temp;
				}
				else
				{
					break;
				}
			}
		}
		
	}
	
	public int binarySearch(String[] stra, String key )
	{
		int n = stra.length;
		
		int l = 0;
		int h = n-1;
		
		while(l<=h)
		{
			
			int mid = (l+h)/2;
			
			//if(stra[mid].equals(key)) or
			if(stra[mid].compareTo(key) == 0)
			{
				return mid;
			}
			else if(stra[mid].compareTo(key) < 0)
			{
				l = mid + 1;
			}
			else
			{
				h = mid-1;
			}
		}
		return -1;
		
	}
	

	public static void main(String[] args) {
		
		String[] strarr = new String[5];
		
		strarr[0] = new String("xxy");
		strarr[1] = new String("xxxy");
		strarr[2] = new String("xyy");
		strarr[3] = new String("xxxxy");
		strarr[4] = new String("xxx");
		
		System.out.println("string array before sorting:");
		for(int i=0; i<strarr.length; i++)
		{
			System.out.println(strarr[i]);
		}
		
		StringSort ss = new StringSort();
		//java.util.Arrays.sort(strarr);
		ss.insertionSort(strarr);
		
		System.out.println("\nstring array after sorting:\n");
		for(int i=0; i<strarr.length; i++)
		{
			System.out.println(strarr[i]);
		}
		
		String key;
		
		key="xxy";
		
		int res = ss.binarySearch(strarr, key);
		
		if(res == -1)
		{
			System.out.println(key + " is not present in the array");
		}
		else
		{
			System.out.println("\n" + key + " is present at index " + res);
		}
		
		String[] strarr2 = {"fsft", "erget", "hdth", "oijri", "hbvjcnm"};
		
		System.out.println("\nstring array before sorting:\n");
		for(int i=0; i<strarr2.length; i++)
		{
		System.out.println(strarr2[i]);
		}
		
		ss.insertionSort(strarr2);
		
		System.out.println("\nstring array after sorting:\n");
		for(int i=0; i<strarr2.length; i++)
		{
		System.out.println(strarr2[i]);
		}
		
	}

}
