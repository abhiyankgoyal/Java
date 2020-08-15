package stack;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		next = null;
	}
}

public class StackWithLinkedList {

	Node top;
	
	StackWithLinkedList(){
		top = null;
	}
	
	public void push(int data) {
		
		Node npInsert = new Node(data);
		
		if(top == null) {
			top = npInsert;
		}
		else {
			npInsert.next = top;
			top = npInsert;
		}
	}
	
	public void peek() {
		if(top == null) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println(top.data);
		}
	}
	
	public int pop() {
		if(top == null) {
			System.out.println("stack is empty");
			return -1;
		}
		else {
			int popData = top.data;
			top = top.next;
			return popData;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackWithLinkedList obj = new StackWithLinkedList();
		obj.push(12);
		obj.push(56);
		obj.peek();
		System.out.println(obj.pop());
		obj.peek();
	}

}
