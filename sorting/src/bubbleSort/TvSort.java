package bubbleSort;

class tv{
	
	private int price;
	private String company;
	private int inch;
	
	tv(int p, String c, int i)
	{
		price=p;
		company=c;
		inch=i;
	}
	
	public int getPrice()
	{
		return price;
	}
	public String getCompany()
	{
		return company;
	}
	public int getInch() {
		return inch;
	}
	public void setPrice(int p)
	{
		price=p;
	}
	public void setCompany(String c)
	{
		company=c;
	}
	public void setInch(int i)
	{
		inch=i;
	}
	public String toString()
	{
		String res="( Company "+ company + " inch " + inch + " price " + price + ")";
		return res;
	}
	
}

public class TvSort {
	
		public void bubbleSortPrice(tv[] items)
		{
			int n=items.length;
			
			for(int i=0;i<=n-1;i++)
			{
				for(int j=0;j<n-i-1;j++)
				{
					if(items[j].getPrice()>items[j+1].getPrice())
					{
						tv temp=items[j];
						items[j]=items[j+1];
						items[j+1]=temp;
						
					}
				}
			}
		}
		public void bubbleSortSize(tv[] items)
		{
			int n=items.length;
			
			for(int i=0;i<=n-1;i++)
			{
				for(int j=0;j<n-i-1;j++)
				{
					if(items[j].getInch()>items[j+1].getInch())
					{
						tv temp=items[j];
						items[j]=items[j+1];
						items[j+1]=temp;
						
					}
				}
			}
		}

	public static void main(String[] args) {
		
		tv t1=new tv(29999,"MI",40);
		tv t2=new tv(13999,"Samsung",29);
		tv t3=new tv(23999,"LG",32);
		tv t4=new tv(39999,"Huawei",43);
		tv t5=new tv(34999,"Sony",29);
		tv t6=new tv(44999,"Panasonic",50);
		tv t7=new tv(24999,"toshiba",32);
		
		tv[] items= {t1,t2,t3,t4,t5,t6,t7};
		
		int n=items.length;
		
		TvSort obj=new TvSort();
		
		System.out.println("Tvs before sorting according to their price:\n");
		for(int i=0;i<n;i++)
		{
			System.out.println(items[i]);
		}
		
		obj.bubbleSortPrice(items);
		
		System.out.println("\nTvs After sorting according to their price:\n");
		
		for(int i=0;i<n;i++)
		{
			System.out.println(items[i]);
		}
		
		System.out.println("\nTvs after sorting according to their size:\n");
		
		obj.bubbleSortSize(items);
		
		for(int i=0;i<n;i++)
		{
			System.out.println(items[i]);
		}
		
		
	}

}
