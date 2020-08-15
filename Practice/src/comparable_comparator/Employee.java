package comparable_comparator;

import java.util.*;
import java.util.Arrays;

class EmployeeByAge implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		int currentAge = e1.age;
		int newAge  =e2.age;
		if(currentAge < newAge) {
			return -1;
		}
		else {
			return 1;
		}
	}
}

class EmployeeByName implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		String currentName = e1.name;
		String newName  =e2.name;
		if(currentName.compareTo(newName) < 0) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
public class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;
	int age;
	

	public Employee(int id, String name, double salary, int age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	/*
	 * 
	 * if we want ascending order on some attribute like (salary or age or id or name)
	 * return negative if currentvalue < new value
	 * 
	 * 
	 * */
	@Override
	public int compareTo(Employee e1) {
		double firstSalary = this.salary;
		double secondSalary = e1.salary;
		if(firstSalary > secondSalary) {
			return 1;
		}
		else if(firstSalary < secondSalary) {
			return -1;
		}
		else {
			return 0;
		}
	}


	public static void main(String[] args) {
		int[] arr = {56,12,89,34};
		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		List<Integer> list = new ArrayList<>();
		list.add(56);
		list.add(12);
		list.add(89);
		list.add(34);
		Collections.sort(list);
		//System.out.println(list);
		
		
		Employee e1 = new Employee(1,"mayank",70000,27);
		Employee e2 = new Employee(2,"abhiyank",5000000,22);
		Employee e3 = new Employee(3,"matpita",1200000,58);
		Employee e4 = new Employee(4,"matshri",1000000,52);
		Employee[] employees = {e1,e2,e3,e4};
//		for(int i=0;i<employees.length;i++) {
//			System.out.println(employees[i]);
//		}
		Arrays.sort(employees);
		for(int i=0;i<employees.length;i++) {
			System.out.println(employees[i]);
		}
		System.out.println("------------------------");
		Arrays.sort(employees, new EmployeeByAge());
		for(int i=0;i<employees.length;i++) {
			System.out.println(employees[i]);
		}
		System.out.println("------------------------");
		Arrays.sort(employees, new EmployeeByName());
		for(int i=0;i<employees.length;i++) {
			System.out.println(employees[i]);
		};
		
		
		System.out.println("------------------------");
		// java8 new syntax
		// sort by id
//		 phone band haan , samjha , haan mene e1 or e2 ko kyun change kiya emp1 or emp2 mein, vo phle se declare the islye 
		// ek aur method batata hun
		Arrays.sort(employees, (emp1,emp2) -> {
			
			if(emp1.id < emp2.id) {
				return -1;
			}
			else {
				return 1;
			}
		});
		for(int i=0;i<employees.length;i++) {
			System.out.println(employees[i]);
		};

		// sort by salary using inline comparator
		System.out.println("----------------");
		Arrays.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				return (int)(emp1.salary - emp2.salary);
			}
		});
		for(int i=0;i<employees.length;i++) {
			System.out.println(employees[i]);
		};
	}

}
