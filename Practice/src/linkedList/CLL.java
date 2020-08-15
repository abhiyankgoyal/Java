package linkedList;

class Node4 {
	int data;
	Node4 next;
	
	Node4(int data) {
		this.data = data;
		this.next = null;
	}
}

public class CLL {

	Node4 head;
	
	CLL(){
		head = null;
	}
	
	public Node4 insert(int data) {
		
		Node4 npInsert = new Node4(data);
		if(head == null) {
			head = npInsert;
			head.next = head;
		}
		else {
			Node4 np = head;
			while(np.next != head) {
				np = np.next;
			}
			np.next = npInsert;
			npInsert.next = head;
		}
		return head;
	}
	
	
	public void display() {
		
		Node4 np = head;
		if(head == null) {
			System.out.println("Linked list is empty");
		}
		else {
			do{
				System.out.println(np.data);
				np = np.next;
			}while(np != head);
		}
	}
	
		public static void main(String[] args) {
			CLL ll = new CLL();
			System.out.println("LL1:");
			ll.insert(1);
			ll.insert(2);
			ll.insert(3);
			ll.insert(4);
			ll.insert(5);
			ll.insert(6);
			ll.display();
		}
}
