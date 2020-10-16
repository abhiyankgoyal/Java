package insertionSort;

import java.util.Scanner;

class Student{

	private int height;
	private String name;
	private int rollNo;

	Student(int height, String name,int rollNo)
	{

		this.height=height;
		this.name=name;
		this.rollNo=rollNo;
	}

	public int getHeight()
	{
		return this.height;
	}

	public String getName()
	{
		return this.name;
	}

	public int getRollno()
	{
		return this.rollNo;
	}

	public void setHeight(int height)
	{
		this.height=height;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setRoll(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public String toString()
	{
		String res= "( " +this.rollNo+ " " +this.name+ " " +this.height+ " )"; 
		return res;
	}

}


public class SortStudent {

	public void Sort(Student[] s)
	{

		int n=s.length;

		for(int i=1;i<n;i++)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(s[j+1].getHeight()<s[j].getHeight())
				{
					Student temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
				else
				{
					break;
				}
			}
		}
	}

	public static void main(String[] args) {

		int a,b,d;
		String c;
		char ch;


		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		//Scanner sc3=new Scanner(System.in);

		System.out.println("enter the no. of students");

		a=sc.nextInt();

		Student[] s= new Student[a];

		for(int i=0;i<a;i++)
		{
			System.out.println("enter the height of student " +(i+1) );
			b=sc.nextInt();
			System.out.println("enter the name of student " +(i+1) );
			c=sc2.nextLine();
			System.out.println("enter the rollno of student " +(i+1) );
			d=sc.nextInt();
			//			Student student= new Student(b,c,d);
			//			s[i] = student;
			s[i]= new Student(b,c,d);
		}
		System.out.println("students before sorting:");
		for(int i=0;i<a;i++)
		{
			System.out.println(s[i]);
		}

		System.out.println("\ndo you want to change details of any student: y/n ?");
		ch = sc2.nextLine().charAt(0); //for char string needs to be converted in char. charAt(0) will represent the first letter of string.

		while(ch!='y' && ch!='n')
		{
			System.out.println("invalid input");
			System.out.println("do you want to change details of any student: y/n ?");
			ch = sc2.nextLine().charAt(0);
		}

		while(ch=='y')
		{
			System.out.println("which student details you want to change?(1-"+a+")");
			int choice=sc.nextInt();
			while(choice<1 || choice>a)
			{
				System.out.println("invalid input");
				System.out.println("which student details you want to change?(1-"+a+")");
				choice=sc.nextInt();
			}


			System.out.println("enter new height of student " +choice);
			int w=sc.nextInt();
			System.out.println("enter new name of student " +choice);
			String m=sc2.nextLine();
			System.out.println("enter new roll no of student " +choice);
			int f=sc.nextInt();
			s[choice-1].setHeight(w);
			s[choice-1].setName(m);
			s[choice-1].setRoll(f);
			System.out.println("\ndo you want to change details of any student: y/n ?");
			ch = sc2.nextLine().charAt(0);
			while(ch!='n' && ch!='y')
			{
				System.out.println("invalid input");
				System.out.println("do you want to change details of any student: y/n ?");
				ch = sc2.nextLine().charAt(0);
			}

		}	

		System.out.println("students before sorting:");
		for(int i=0;i<a;i++)
		{
			System.out.println(s[i]);
		}
		SortStudent obj=new SortStudent();

		obj.Sort(s);

		System.out.println("\nstudents after sorting:");
		for(int i=0;i<a;i++)
		{
			System.out.println(s[i]);
		}

		// String
		String str = "abhiyank";
		System.out.println(str);
		char[] charr  =str.toCharArray();//to convert string to char array
		for(int i=0;i<charr.length;i++) {
			System.out.print(charr[i]+"---");
		}
		System.out.println();
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+"---");
		}
		sc.close();
		sc2.close();
	}
}