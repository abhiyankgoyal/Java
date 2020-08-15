package linkedList;

class Node3{
	
	int data;
	Node3 next;
	
	Node3(int data){
		this.data = data;
		next = null;
	}
}

public class LinkedList3 {
	
	Node3 head; //global variable
	
	LinkedList3(){
		head = null;
	}
	
	public Node3 insert(int data) {
		
		Node3 npInsert = new Node3(data);
		if(head == null) {
			head = npInsert;
		}
		else {
			insertAtLast(npInsert);
		}
		return head;
	}
	
	public void insertAtLast(Node3 npInsert) {
		
		Node3 np = head;
		while(np.next != null) {
			np = np.next;
		}
		np.next = npInsert;
		
	}
	
	public void display() {
		
		Node3 np = head;
//		if(head == null) {
//			System.out.println("Linked list is empty");
//		}
		while(np != null) {
			System.out.println(np.data);
			np = np.next;
		}
	}
	
	public void joinLinkedList(Node3 head1, Node3 head2) {
		Node3 np1 = head1;
		
		while(np1.next != null) {
			np1 = np1.next;
		}
		np1.next = head2;
	}
	
	public static void main(String[] args) {
		
		LinkedList3 ll3_1 = new LinkedList3();
		System.out.println("LL1:");
		ll3_1.insert(1);
		ll3_1.insert(2);
		ll3_1.insert(3);
		ll3_1.insert(4);
		ll3_1.insert(5);
		ll3_1.insert(6);
		ll3_1.display();
		LinkedList3 ll3_2 = new LinkedList3();
		System.out.println("LL2:");
		ll3_2.insert(7);
		ll3_2.insert(8);
		ll3_2.insert(9);
		ll3_2.insert(10);
		ll3_2.insert(11);
		ll3_2.insert(12);
		ll3_2.display();
		System.out.println("LL3:");
		LinkedList3 ll3_3 = new LinkedList3();
		ll3_3.head = ll3_1.head;
		ll3_3.joinLinkedList(ll3_1.head, ll3_2.head);
		ll3_3.display();
	}
}
