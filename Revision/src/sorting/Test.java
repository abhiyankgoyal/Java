package sorting;

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

public class Test {

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
		// TODO Auto-generated method stub
		System.out.println("enter the no. of students:");
		Scanner sc = new Scanner(System.in); // creating object of scanner class to access its methods
		Scanner sc2 = new Scanner(System.in);
		int n = sc.nextInt(); // accepting input
		Student[] students = new Student[n]; // creating an array of size of no. of students entered by user 
		System.out.println("enter the details of the students:");
		for(int i=0; i<n; i++) {
			System.out.println("enter rollNo of the student " + (i+1) + ":");
			int r = sc.nextInt();
			System.out.println("enter name of the student :" + (i+1) + ":");
			String name = sc2.nextLine();
			System.out.println("enter height of the student :" + (i+1) + ":");
			int h = sc.nextInt();
			students[i] = new Student(r, name, h); // creating each student object with their details 
			System.out.println(students[i]);
		}
		
		System.out.println("students before sorting:");
		for(int i=0;i<n;i++)
		{
			System.out.println(students[i]);
		}
		
		System.out.println("do you want to change details of any student? y/n");
		char ch = sc2.nextLine().charAt(0);
		while(ch != 'y' && ch!= 'n') {
			System.out.println("invalid input");
			System.out.println("do you want to change details of any student: y/n ?");
			ch = sc2.nextLine().charAt(0);
		}
		while(ch == 'y') {
			System.out.println("which student details you want to change?(1-"+n+")");
			int choice=sc.nextInt();
			while(choice < 1 || choice > n) {
				System.out.println("invalid input");
				System.out.println("which student details you want to change?(1-"+n+")");
				choice=sc.nextInt();
			}
			
			System.out.println("which detail you want to change? r/name/h");
			String property = sc2.nextLine();
			while(property != "r" && property != "name" && property != "h") {
				System.out.println("invalid input");
				System.out.println("which detail you want to change r/name/h ?");
				property = sc2.nextLine();
			}
			switch(property) {
			case "r":
				int r = sc.nextInt();
				students[choice].setRoll(r); 
			
			case "name":
				String name = sc2.nextLine();
				students[choice].setName(name);
				
			case "h":
				int h = sc.nextInt();
				students[choice].setRoll(h);
			
			default: 
			}
		}
	}

}
