package search;

import java.util.Scanner;


class Branch1 {
		
		private String name;
		private int students;
		private int staff;
		
		Branch1(String name, int students, int staff)
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
		
		public String toString()
		{
			String r=("( branch " + name + " Students " + students + " Staff " + staff + " )");
			return r;
		}
}

public class ScannerBinary{
	
	public int Search(Branch1[] branches, int k) 
	{
	int n=branches.length;
	
	int s=0;
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
		Scanner sc=new Scanner(System.in);//for integer type
		Scanner sc2=new Scanner(System.in);//for String type
		
		System.out.println("enter the no. of branches");

		int a=sc.nextInt();
		
		Branch1[] b= new Branch1[a];
		
		String name;
		int Students,Staff;
		
		System.out.println("Enter the details of the branches ");
		
		for(int i=0; i<a;i++)
		{
			System.out.println("Branch " +(i+1)+ " name");
			name=sc2.nextLine();
			
			System.out.println("no. of students in branch "+(i+1));
			Students=sc.nextInt();
			
			System.out.println("Staff in branch " +(i+1));
			Staff=sc.nextInt();
			
			b[i]=new Branch1(name,Students,Staff);// to set the details of the branch in the array objects.
		}
		for(int i=0; i<a;i++)
		{
			System.out.println(b[i]);// this will automatically call toString function. 
		}
		
		System.out.println("enter the key");
		int key=sc.nextInt();
		ScannerBinary obj=new ScannerBinary();
		int res=obj.Search(b, key);
		if(res==-1)
		{
			System.out.println(key+ "students are not in any branch");
		}
		else
		{
			System.out.println(key+" students are in "+b[res].getName());
		}
		sc.close();
		sc2.close();
	}

}
