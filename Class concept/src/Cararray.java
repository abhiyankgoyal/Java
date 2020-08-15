
class Carr {

	int price;
	int avg;
	String name;

	Carr(int p, int a, String n){

		price =p;
		avg= a;
		name=n;
	}
}

public class Cararray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carr c1= new Carr(100000,20,"alto");
		Carr c2= new Carr(200000,25,"nano");
		Carr c3= new Carr(300000,22,"dzire");
		Carr c4= new Carr(400000,23,"i20");
		Carr c5= new Carr(500000,24,"i10");
		Carr[] cars= {c1,c2,c3,c4,c5};

		/*cars[0]= c1;
		cars[1]=c2;
		cars[2]=c3;*/
		//int i=0;
		//int found=0;
		/*for( i=0;i<cars.length;i++) // by linear search
		{
			if(cars[i].price==400000)
			{
				System.out.println(cars[i].name);
				found=1;
				break;
			}
		}
		if(found==0)
		{
			System.out.println("Sorry no Car found");
		}*/		
		int s=0,e=cars.length-1;
		int found =0; 

		while(s<=e){

			int mid=(s+e)/2;
			if(cars[mid].price==400000)
			{
				System.out.println(cars[mid].name);
				found=1;
				break;
			}		
			else if(cars[mid].price<800000)
			{
				s=mid+1;
			}
			else
			{
				e=mid-1;
			}
		}
		if(found==0)
		{
			System.out.println("Sorry no car found");
		}

	}

}



