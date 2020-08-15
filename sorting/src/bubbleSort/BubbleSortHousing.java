package bubbleSort;

class House{
	
		private int l;
		private int b;
		private int a;
		private String n;
		
		House(int l,int b, String n)
		{
			this.l=l;
			this.b=b;
			this.a=l*b;
			this.n=n;
		}
		
		public int getLength()
		{
			return this.l;
			
		}
		
		public int getBreadth()
		{
			return this.b;
		}
		public int getArea()
		{
			return this.l*this.b;
		}
		
		public String getName()
		{
			return this.n;
		}
		
		public void setLength(int l)
		{
			this.l=l;
			this.a=this.l*this.b;
		}
		public void setBreadth(int b)
		{
			this.b=b;
			this.a=this.l*this.b;
		}
		
		public void setArea(int a)
		{
			this.a=a;
		}
		public String toString() //toString name is given so that it is not required to call
		{
			String res= "(" + this.a + " " +this.n + ") " ;
			return res;
		}
}

public class BubbleSortHousing {

		public static void sort(House[] houses)
		{
			int n = houses.length;
			
			for(int i=0; i<n-1;i++)
			{
				for(int j=0;j<n-i-1;j++)
				{
					if(houses[j].getArea()<houses[j+1].getArea())
					{
						House temp=houses[j];
						houses[j]=houses[j+1];
						houses[j+1]=temp;
					}
				}
			}
		}
	
	public static void main(String[] args) {
		
		House h1=new House(30,50,"H1");
		House h2=new House(20,20,"H2");
		House h3=new House(50,20,"H3");
		House h4=new House(40,40,"H4");
		House h5=new House(10,50,"H5");
		
		House[] houses= {h1,h2,h3,h4,h5};
		
		int m=houses.length;
		
		//BubbleSortHousing obj=new BubbleSortHousing();
		
		System.out.println("Houses area before sorting");
		for(int i=0; i<m;i++)
		{
			System.out.print(houses[i].toString()+ " ");
		}
		
		sort(houses);// we can do without making objects also
		System.out.println("\nHouses area After sorting");
		for(int i=0;i<m;i++)
		{
			System.out.print(houses[i] + " "); // automatically calls toString function if object is called directly.
		}
		
	}

}
