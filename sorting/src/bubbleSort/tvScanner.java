package bubbleSort;

import java.util.Scanner;

class tv2 {

	private int p;
	private String c;
	private int i;

//	tv2(int p, String c, int i)
//	{
//		this.p=p;
//		this.c=c;
//		this.i=i;
//	}

	public int getPrice()
	{
		return p;
	}
	public String getCompany()
	{
		return c;
	}
	public int getInch() {
		return i;
	}
	public void setPrice(int m)
	{
		p=m;
	}
	public void setCompany(String n)
	{
		c=n;
	}
	public void setInch(int p)
	{
		i=p;
	}
	public String toString()
	{
		String res="( Company "+ c + " inch " + i + " price " + p + ")";
		return res;
	}
}

public class tvScanner{

	public void bubbleSortPrice(tv2[] items)
	{
		int n=items.length;

		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(items[j].getPrice()>items[j+1].getPrice())
				{
					tv2 temp=items[j];
					items[j]=items[j+1];
					items[j+1]=temp;

				}
			}
		}
	}
	public void bubbleSortSize(tv2[] items)
	{
		int n=items.length;

		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(items[j].getInch()>items[j+1].getInch())
				{
					tv2 temp=items[j];
					items[j]=items[j+1];
					items[j+1]=temp;

				}
			}
		}
	}

	public static void main(String[] args)
	{	
		tv2 t1=new tv2();
		tv2 t2=new tv2();
		tv2 t3=new tv2();
		tv2 t4=new tv2();
		tv2 t5=new tv2();
		
		tv2[] tvs= {t1,t2};
		
		int n=tvs.length;
		
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the details of the tv: ");
		
		for(int i=0; i<n;i++)
		{
			System.out.println("tv:" +(i+1));
			int price=sc.nextInt(); // accepting price
			tvs[i].setPrice(price); // setting the price to the object
			String name=sc2.nextLine(); //accepting the company name
			tvs[i].setCompany(name); // setting the company name to the object
			int inch=sc.nextInt(); // accepting inch
			tvs[i].setInch(inch); // setting inch to the object
			System.out.println(tvs[i]);
		}
		
		System.out.println("Tvs before sorting according to their price:\n");
		for(int i=0;i<n;i++)
		{
			System.out.println(tvs[i]);
		}
		
		System.out.println();
		
		tvScanner obj = new tvScanner();
		
		obj.bubbleSortPrice(tvs);
		
		System.out.println("Tvs after sorting according to their price:\n");
		for(int i=0;i<n;i++)
		{
			System.out.println(tvs[i]);
		}
		
		sc.close();
		sc2.close();

	}
}