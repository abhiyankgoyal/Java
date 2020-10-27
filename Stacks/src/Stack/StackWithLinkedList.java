package Stack;
import java.util.Stack;
//all push and pop operation should be O(1)
/*
 * 
 * 
 * if stack is empty consider my linked list is empty
 * if push operation is performed we add a node in a linked list
 * for pop operation we delete the last node added
 * 
 * Method 1:
 *   
 *   push(24)
 *   		24
 *   push(35)
 *   			24 - > 35
 *   push(56) // we have to go till last node and then append our new node with value 56
 *   		 // so this becomes O(n) operation does violating stack rules
 *   		// hence method 1 is not a good option to create stack
 *   
 *   So we can resolve this issue by having top pointing to last node
 *   
 *   so now our push operation is O(1)
 *   
 *   pop()
 *   	24 -> 35 -> 56
 *   	head		top
 *   Now we want:
 *   	24 -> 35 -> 56
 *   	head  top
 *   
 *   So in order to use Method 1  we can use doubly linked list instead of singly linked list
 *   
 *  Method 2:
 *  push(24)
 *  	24
 *  head, top
 * push(35)
 * 		35 -> 24
 * 		top
 * push(56)
 * 		56 -> 35 -> 24
 * 		top
 * All push operations here are in o(1)
 * 
 * pop() // top = top.next;
 * 	56->35->24
 * 		top
 * pop()
 * 56 -> 35 -> 24
 * 				top
 * 
 * all pop() operations are in O(1)
 * 
 * */

class Node{
	int data;
	Node next;
	
	Node(int val){
		this.data = val;
		this.next = null;
	}
}

public class StackWithLinkedList {
	
	Node top;
	
	StackWithLinkedList(){
		this.top = null;
	}
	
	public void push(int val){
		Node npInsert = new Node(val);
		if(top == null){
			
			top = npInsert;
		}
		
		else{
			npInsert.next = top;
			top = npInsert;
		}
	}
	
	public int pop(){
		if(top == null){
			System.out.println("stack is empty");
			return -1;
		}
		
		else{
			int a = top.data;
			top = top.next;
			return a;
		}
		
	}
	
	public int peek(){
		if(top == null){
			System.out.println("stack is empty");
			return -1;
		}
		return top.data;
	}

	public static void main(String[] args) {
		
		StackWithLinkedList obj = new StackWithLinkedList();
		
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		//obj.push(6);
		
		//System.out.println("Stack is :");
		
		//obj.display();
		
		int popElement = obj.pop();
		System.out.println(popElement);
		int val= obj.peek();
		System.out.println(val);
		//obj.display();
		
		popElement = obj.pop();
		System.out.println(popElement);
		val = obj.peek();
		System.out.println(val);
		//obj.display();
		
		popElement = obj.pop();
		System.out.println(popElement);
		val = obj.peek();
		System.out.println(val);
		//obj.display();
		
		popElement = obj.pop();
		System.out.println(popElement);
		val = obj.peek();
		System.out.println(val);
		//obj.display();
		
		popElement = obj.pop();
		System.out.println(popElement);
		val = obj.peek();
		System.out.println(val);
		//obj.display();
		
		Stack<Integer> stack = new Stack<Integer>(); // integer datatype linkedlist
		
		stack.push(24);
		stack.push(56);
		System.out.println(stack);
		int x = stack.pop();
		System.out.println(x);
		System.out.println(stack);
		Stack<Double> stack2 = new Stack<Double>(); // double datatype linkedlist
		stack2.push(3.0); 
		
		Stack s = new Stack(); // mixed data type linked list
		s.push(90);
		s.push("abhiyank");
		s.push(89.0);
		System.out.println(s);
	}

}
