package search;

class Branch{
	
	private String name; //it is a good practice to declare instance variable as private
	private int students;
	private int staff;
	
	Branch(String name, int students, int staff)
	{
		this.name=name;
		this.students=students;
		this.staff= staff;
	}
	
	public String getName() 
	{
		return this.name;
	}
	
	public int getStudents()
	{
		return this.students;
	}
	
	public int getStaff()
	{
		return this.staff;
	}
	
	public void setName(String name) 
	{
		this.name=name;
	}
	
	public void setStudents(int students)
	{
		this.students=students;
	}
	
	public void setStaff(int staff) 
	{
		this.staff=staff;
	}
}
	
public class binarySearchBranch
{
	
	public int Search(Branch[] branches, int k) 
	{
		int n=branches.length;
		
		int s=0;  // local variable (it can't be used in function)
		int e=n-1;
		while(s<=e)
		{
			int mid = (s+e)/2;
			if (branches[mid].getStudents()==k)
			{
				return mid;
			}
			else if(branches[mid].getStudents()<k)
			{
				s=mid + 1;
			}
			else
			{
				e=mid - 1;
			}
		}
		return -1;
	}
	

	

	public static void main(String[] args)
	{
		
		Branch b1= new Branch("cse",200,70);
		Branch b2= new Branch("mech",250,50);
		Branch b3= new Branch("civil",300,60);
		Branch b4= new Branch("chem",400,10);
		Branch b5= new Branch("e&tc",500,30);
		
		Branch[] branches= {b1,b2,b3,b4,b5};
		
		binarySearchBranch obj=new binarySearchBranch();
		
		int key=250;
		//System.out.println(b[0].getStudents());
		
		int res=obj.Search(branches, key);
		
		System.out.println(res);
		
		if(res==-1)
		{
			System.out.println("sorry " + key+" students is not in any branch");
		}
		else
		{
			System.out.println(key+" students are found in " +branches[res].getName() + " branch");
		}
		
	}

}
