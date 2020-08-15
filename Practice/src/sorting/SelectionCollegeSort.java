package sorting;

import java.util.Scanner;

class College{
	
	private String name;
	private int rank;
	
	College(String name,int rank)
	{
		this.name=name;
		this.rank=rank;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getRank()
	{
		return this.rank;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setRank(int rank)
	{
		this.rank=rank;
	}
	
	public String toString()
	{
		return name+ " rank " +rank;
	}
}

public class SelectionCollegeSort {
	
	public void Sort(College[] colleges)
	{
		int n=colleges.length;
		
		for(int i=0;i<n;i++)
		{
			int min_index=i;
			
			for(int j=i+1;j<n;j++)
			{
				if(colleges[j].getRank()<colleges[min_index].getRank())
				{
					min_index=j;
				}
			}
			College temp=colleges[i];
			colleges[i]=colleges[min_index];
			colleges[min_index]=temp;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		String name;
		int rank;
		
		System.out.println("enter the no. of colleges");
		int n=sc.nextInt();
		
		College[] colleges=new College[n];
		
		System.out.println("enter details of colleges");
		
		for(int i=0;i<n;i++)
		{
			System.out.println("college "+(i+1)+ " name ");
			name=sc2.nextLine();
			
			System.out.println("college "+(i+1)+ " rank ");
		    rank=sc.nextInt();
		    
		    colleges[i]=new College(name,rank);
		}
		
		SelectionCollegeSort obj=new SelectionCollegeSort();
		
		obj.Sort(colleges);
		
		for(int i=0;i<n;i++)
		{
			System.out.println(colleges[i]+" ");
		}
		
		sc.close();
		sc2.close();

	}

}
