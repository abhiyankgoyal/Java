package sorting;

class Hotel{
	
	private String name;
	private int star;
	
	Hotel(String name,int star)
	{
		this.name=name;
		this.star=star;
	}
	
	
	public String getName() 
	{
		return this.name;
	}
	
	public int getStar()
	{
		return this.star;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setStar(int star)
	{
		this.star=star;
	}
	
	public String toString()
	{
		String res="Hotel "+ name+ " "+star+ " Star";
		return res;
	}
}

public class HotelSort {
	
	public void Sort(Hotel[] hotels)
	{
	 int n=hotels.length;
	 for(int i=0;i<n-1;i++)
	 {
		 for(int j=0;j<n-i-1;j++)
		 {
			 if(hotels[j].getStar()>hotels[j+1].getStar())
			 {
				 Hotel temp=hotels[j];
				 hotels[j]=hotels[j+1];
				 hotels[j+1]=temp;
			 }
		 }
	 }
	}
	

	public static void main(String[] args) {
		
		Hotel r1=new Hotel("noor us sabah", 5);
		Hotel r2=new Hotel("sayaji", 4);
		Hotel r3=new Hotel("ashoka", 2);
		Hotel r4=new Hotel("imperial sibare", 3);
		Hotel r5=new Hotel("gk palace", 1);
		
		Hotel[] hotels= {r1,r2,r3,r4,r5};
		int n=hotels.length;
		HotelSort obj = new HotelSort();
		obj.Sort(hotels);
		for(int i=0;i<n;i++)
		{
			System.out.println(hotels[i]+" ");
		}

	}

}