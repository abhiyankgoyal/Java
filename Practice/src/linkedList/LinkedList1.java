package linkedList;

class Node{
	
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		next = null;
	}
}

public class LinkedList1 {
	
	public void display(Node head) {
		
		Node np = head;
		
		while(np != null) {
			System.out.print(np.data + ", ");
			np = np.next;
		}
	}
	
	public int search(Node head, int data) {
		
		int pos = 1;
		Node np = head;
		
		while(np!=null) {
			if(np.data == data) {
				return pos;
			}
			np = np.next;
			pos++;
		}
		return pos;
	}
	
	public Node insertAtFirst(Node head, int data) {
		
		//Node np = head;
		Node npInsert = new Node(data);
		
		//npInsert.next = np;
		npInsert.next = head;
		head = npInsert;
		
		return head;
		
	}
	
	public void insertAtLast(Node head, int data) {
		
		Node np = head;
		Node npInsert =  new Node(data);
		
		while(np.next != null) {
			np = np.next;
		}
		
		np.next = npInsert;
	}
	
	public void insertInBetween(Node head, int data, int pos) {
		
		Node np = head;
		Node npInsert = new Node(data);
		int count = 1;
		
		while(count != pos-1) {
			np = np.next;
			count++;
		}
		
		npInsert.next = np.next;
		np.next = npInsert;
		
	}
	
	public void replaceDataAtNode(Node head, int data, int pos) {
		
		Node np = head;
		int count = 1;
		
		while(count != pos) {
			np = np.next;
			count++;
		}
		
		np.data = data;
		
	}
	
	public Node delete(Node head, int pos) { // delete in between
		
		Node np = head;
		int count = 1;
		
		while(count!= pos-1) {
			np = np.next;
			count++;
		}
		
		np.next = np.next.next;
		return head;
	}
	
	public static void main(String[] args) {
		
		LinkedList1 ll = new LinkedList1();
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		Node head = n1;
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		ll.display(head);
		
		System.out.println();
		
		int pos = ll.search(head, 4);
		System.out.print(pos + "\n");
		
		head = ll.insertAtFirst(head, 0);
		ll.display(head);
		
		System.out.println();
		
		ll.insertAtLast(head, 6);
		ll.display(head);
		
		System.out.println();
		
		ll.insertInBetween(head, 7, 4);
		ll.display(head);
		
		System.out.println();
		
		ll.replaceDataAtNode(head, 9, 4);
		ll.display(head);
		
		System.out.println();
		
		ll.delete(head, 4);
		ll.display(head);
		
		
		
	}

}
