package queue;

class Node{
	
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		next = null;
	}
}

public class QueueWithLinkedList {
	
	Node head;
	Node tail;
	
	QueueWithLinkedList(){
		this.head = null;
		this.tail = null;
	}
	
	public void add(int data) {
		Node npInsert = new Node(data);
		if(head == null) {
			head = npInsert;
			tail = npInsert;
		}
		else {
			tail.next = npInsert;
			tail = npInsert;
		}
	}
	
	public void peek() {
		
		if(head == null) {
			System.out.println("Queue is empty");
		}
		else {
			System.out.println(head.data);
		}
	}
	
	public int remove() {
		if(head == null) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			int removedData = head.data;
			head = head.next;
			return removedData;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueWithLinkedList obj = new QueueWithLinkedList();
		obj.add(25);
		obj.add(98);
		obj.add(65);
		obj.add(324);
		obj.peek();
		int removedElement = obj.remove();
		System.out.println(removedElement);
		obj.peek();
		System.out.println(obj.remove());
		obj.peek();
		System.out.println(obj.remove());
		obj.peek();
		System.out.println(obj.remove());
		obj.peek();
		System.out.println(obj.remove());
	}
}
