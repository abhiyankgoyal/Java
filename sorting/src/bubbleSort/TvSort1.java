package bubbleSort;

class newTV{

	private int p;
	private String c;
	private int i;

	newTV(int p, String c, int i)
	{
		this.p=p;
		this.c=c;
		this.i=i;
	}

	public int getPrice()
	{
		return this.p;
	}
	public String getCompany()
	{
		return this.c;
	}
	public int getInch() {
		return this.i;
	}
	public void setPrice(int p)
	{
		this.p=p;
	}
	public void setCompany(String c)
	{
		this.c=c;
	}
	public void setInch(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		String res="( Company "+ this.c + " inch " + this.i + " price " + this.p + ")";
		return res;
	}

}

public class TvSort1{

	public void bubbleSortPrice(newTV[] items)
	{
		int n=items.length;

		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(items[j].getPrice()>items[j+1].getPrice())
				{
					newTV temp=items[j];
					items[j]=items[j+1];
					items[j+1]=temp;

				}
			}
		}
	}
	public void bubbleSortSize(newTV[] items)
	{
		int n=items.length;

		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(items[j].getInch()>items[j+1].getInch())
				{
					newTV temp=items[j];
					items[j]=items[j+1];
					items[j+1]=temp;

				}
			}
		}
	}

	public static void main(String[] args) {

		newTV t1=new newTV(29999,"MI",40);
		newTV t2=new newTV(13999,"Samsung",29);
		newTV t3=new newTV(23999,"LG",32);
		newTV t4=new newTV(39999,"Huawei",43);
		newTV t5=new newTV(34999,"Sony",29);
		newTV t6=new newTV(44999,"Panasonic",50);
		newTV t7=new newTV(24999,"toshiba",32);

		newTV[] items= {t1,t2,t3,t4,t5,t6,t7};

		int n=items.length;

		TvSort1 obj=new TvSort1();

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


