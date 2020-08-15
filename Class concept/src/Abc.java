
class Student { //it is basically a template for the object & is always singular 
	int rollno; // these variables are instance variables (* all instance variables has default value if not initialized in constructor)
	int marks;

	Student(int r, int m) { // constructor: it initializes the parameters or instance variables. Constructor name is always class name.
		rollno = r;
		marks = m; // if marks = 18..then o/p will be 18  18
	}
}


public class Abc {


	public static void main(String[] args) { // static function does not behave as a normal function
		Student s1 = new Student(1,20);
		Student s2 = new Student(2,40);
		//s1.marks = 20; if there is no constructor then initialize like this
		//s1.rollno = 1;
		//s2.marks = 40;
		//s2.rollno = 2;
		System.out.println(s1.marks+" "+s2.marks);//o/p will be 20 40
	}

}