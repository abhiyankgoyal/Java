class House1{
	
	private int l;
	private int w;
	private int area;
	
	House1(int l, int w)
	{
		this.l = l;
		this.w = w;
		this.area = l*w; 
	}
	
	public int getLength()
	{
		return this.l;
	}
	
	public int getWidth()
	{
		return this.w;
	}
	public int getArea()  //camelcase 
	{
		return this.l*this.w; // return this.area;
	}
	public void setLength(int l)
	{
		this.l=l;
		//this.area=this.l * this.w;
	}
	public void setWidth(int w)
	{
		this.w=w;
		//this.area=this.l * this.w;
	}
	
	public String toString() // to print object
	{
		String res = this.l + " " + this.w + " " + this.area;
		return res;
/*		                     OR
		return this.l + " " + this.w + " " + this.area;
*/
	}
	
}
public class Housebinarysearch {
	
		public int binarySearch(House1[] houses, int val)
		{
			int l=0; 
			int h= houses.length-1;
			while(l<=h)
			{	
				int mid=(l+h)/2;
				
				if(houses[mid].getArea()==val)
				{
					return mid;
				}
				else if(houses[mid].getArea()<val)
				{
					l=mid+1;
				}
				else
				{
					h=mid-1;
				}
			}
			return -1;
		}
	

	public static void main(String[] args) {
		
		House1 h1=new House1(30,20);
		House1 h2=new House1(30,20);
		House1 h3=new House1(50,40);
		House1 h4=new House1(60,40);
		House1 h5=new House1(70,50);
		
		System.out.println(h5);
		
		House1[] houses= {h1,h2,h3,h4,h5};
		
		Housebinarysearch h=new Housebinarysearch();
		
		int val=2400;
		
		int res=h.binarySearch(houses, val);
		if(res==-1)
		{
			System.out.println("sorry no such house found");
		}
		else
		{
			System.out.println(houses[res].getLength());
		}
		
		House1 h6=new House1(80,60);
		System.out.println(h6);
		h6.setLength(120);
		h6.setWidth(10);
		System.out.println(h6.getArea());
		
		String s1 = new String("fghj");
		String s2 = new String("fghj");
		//String s3 = "yhn";
		//String s4 = "yhn";
		System.out.println(s1);
		if(s1 == s2) {                // here objects are compared which can never be same.
			System.out.println("s1 and s2 are same");
		}
		else {
			System.out.println("s1 and s2 are not same");
		}
		if(s1.equals(s2)) {         // here values of the objects are compared. 
			System.out.println("now s1 and s2 values are compared and they are same");
		}
		else {
			System.out.println("now s1 and s2 values are compared and they are not same");
		}
		
	}

}
