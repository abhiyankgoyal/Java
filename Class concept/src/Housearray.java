class House{
	
	int length;
	int width;
	int area;
	
	House(int l, int w)
	{
		length = l;
		width = w;
		area = l*w;
	}
}


public class Housearray {

	public static void main(String[] args) {
		
		House h1=new House(60,20);
		House h2=new House(50,30);
		House h3=new House(70,20);
		House h4=new House(70,30);
		House h5=new House(60,40);
		
		House[] houses= {h1,h2,h3,h4,h5};
		
		int found=0;
		
		for(int i=0; i<houses.length;i++)
		{
			if(houses[i].area==2100)
			{
				System.out.println(houses[i].length+" "+houses[i].width);
				found=1;
				break;
			}
		}
		if(found==0)
		{
			System.out.println("sorry no such house found");
		}
	}

}
