package linkedList;

class Node2{
	
	int data;
	Node2 next;
	
	Node2(int data){
		this.data = data;
		next = null;
	}
}

public class LinkedList2 {
	
	public void display(Node2 head) {
		if(head == null) {
			System.out.println("Linked List is empty");
		}
		else {
			Node2 np = head;
			while (np != null) {
				System.out.print(np.data + ",");
				np = np.next;
			}
		}
	}

	public Node2 insert(Node2 head, int data) {
		
		Node2 np = head;
		Node2 npInsert = new Node2(data);
		
		if(head == null) {
			head = npInsert;
			
		}
		else {
			while(np.next != null ) {
				np = np.next;
			}
			np.next = npInsert;
		}
		return head;
	}
	
	public Node2 delete(Node2 head, int pos) {
		
		if(head == null) {
			System.out.println("Linked list is empty");
		}
		else if(pos == 1) {
			// Node np = head;
			// head = np.next;
			// OR
			head = head.next;
			return head;
		}
		else {
			
			int count = 1;
			Node2 np = head;
			while(np != null && count != pos-1) {
				np = np.next;
				count++;
			}
			if(np == null) { 
				return head;
			}
			if(np.next == null) {
				return head;
			}
			else {
				np.next = np.next.next;
			}
		}
		return head;
	}
	
	public static void main(String[] args) {
		
		LinkedList2 ll2 = new LinkedList2();
		
		Node2 head = null;
		
		head = ll2.insert(head, 1);
		ll2.insert(head, 2);
		ll2.insert(head, 3);
		ll2.insert(head, 4);
		ll2.insert(head, 5);
		ll2.insert(head, 6);
		ll2.insert(head, 7);
		
		ll2.display(head);
		
		System.out.println();
		
		head = ll2.delete(head, 3);
		ll2.display(head);
		
	}
	
}
