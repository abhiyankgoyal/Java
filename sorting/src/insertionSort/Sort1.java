package insertionSort;

class Student1{

	private int h;
	private String n;
	private int r;

		Student1(int h, String n,int r)
		{
			
			this.h=h;
			this.n=n;
			this.r=r;
		}

	public int getHeight()
	{
		return this.h;
	}

	public String getName()
	{
		return this.n;
	}

	public int getRollno()
	{
		return this.r;
	}

	public void setHeight(int h)
	{
		this.h=h;
	}
	public void setName(String n)
	{
		this.n=n;
	}
	public void setRoll(int r)
	{
		this.r=r;
	}
	public String toString()
	{
		String res= "( " +this.r+ " " +this.n+ " " +this.h+ " )"; 
		return res;
	}

}

public class Sort1 {
	
	public void insertionSort(Student1[] a)
	{
		int n=a.length;
		
		for(int i=1;i<n;i++)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(a[j+1].getHeight()<a[j].getHeight())
				{
					Student1 temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				else
				{
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Student1 s1=new Student1(160,"ab",1);
		Student1 s2=new Student1(150,"cd",2);
		Student1 s3=new Student1(175,"ef",3);
		Student1 s4=new Student1(155,"gh",4);
		Student1 s5=new Student1(170,"ij",5);
		Student1 s6=new Student1(165,"kl",6);
		
		Student1[] students= {s1,s2,s3,s4,s5,s6};
		
		int n=students.length;
		
		Sort1 obj=new Sort1();
		
		System.out.println("before sorting");
		
		for(int i=0;i<n;i++)
		{
			System.out.println(students[i]);
		}
		
		obj.insertionSort(students);
		
		System.out.println("after sorting");
		
		for(int i=0;i<n;i++)
		{
			System.out.println(students[i]);
		}
		

	}

}
