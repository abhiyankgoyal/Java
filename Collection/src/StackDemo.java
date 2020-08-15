import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		System.out.println(s.empty());
		System.out.println(s.search("fs"));
		s.push("a");
		s.push(1);
		s.add(32);
		System.out.println(s.search(32));
		System.out.println(s.search("a"));
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.capacity());
		s.addElement(11); // since it is child of vector class
		System.out.println(s);
	}

}
