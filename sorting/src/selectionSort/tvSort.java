package selectionSort;

class tv{
	
	private int p;
	private int i;
	private String n;
	
	tv(int p, int i, String n)
	{
		this.p=p;
		this.i=i;
		this.n=n;
	}
	
	public int getPrice()
	{
		return this.p;
	}
	public int getInch()
	{
		return this.i;
	}
	public String getName()
	{
		return this.n;
	}
	
	public void setPrice(int p)
	{
		this.p=p;
	}
	public void setInch(int i)
	{
		this.i=i;
	}
	public void setName(String n)
	{
		this.n=n;
	}
	public String toString()
	{
		String res="( Company "+ this.n + " inch " + this.i + " price " + this.p + ")";
		return res;
	}
}
public class tvSort {
	
	public void selectionSort(tv[] arr)
	{
		int n=arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			int min_index=i;
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[j].getPrice()<arr[min_index].getPrice())
				{
					min_index=j;
				}
			}
				tv temp=arr[i];
				arr[i]=arr[min_index];
				arr[min_index]=temp;
		}
	}		

	public static void main(String[] args) {
		
		tv t1=new tv(29000,40,"samsung");
		tv t2=new tv(14000,21,"MI");
		tv t3=new tv(35000,50,"LG");
		tv t4=new tv(25000,32,"philips");
		tv t5=new tv(19000,29,"sony");
		tv t6=new tv(22000,30,"Panasonic");
		
		tv[] items= {t1,t2,t3,t4,t5,t6};
		
		tvSort obj=new tvSort();
		
		int n=items.length;
		System.out.println("array before sorting: ");
		for(int i=0;i<n;i++) {
			System.out.println(items[i]+ " ");
		}
		
		obj.selectionSort(items);
		
		System.out.println("\narray after sorting: ");
		for(int i=0;i<n;i++) {
			System.out.println(items[i]+ " ");
		}
		
		System.out.println("tv with max price: " +items[n-1]);
		
		for(int i=0;i<n;i++)
		{
			items[i].setPrice(items[n-1].getPrice()); // to set the price of every tv as highest price
		}
		
		System.out.println("updated price");
		for(int i=0;i<n;i++) {
			System.out.println(items[i]+ " ");
		}
	}

}
