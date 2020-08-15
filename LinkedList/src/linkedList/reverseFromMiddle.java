package linkedList;

class Node11{
	int data;
	Node11 next;
	
	Node11(int data){
		this.data = data;
		this.next = null;
	}
}

public class reverseFromMiddle {
	

	Node11 head;
	
	reverseFromMiddle(){
		this.head = null;
	}
	
	public Node11 insert(int data) {
		
		Node11 npInsert = new Node11(data);
		
		if(head == null)
		{
			head = npInsert; 
		}
		else
		{
			insertAtLast(npInsert);
		}
		return head;
	}
	
	public void insertAtLast(Node11 npInsert) {
		
		Node11 np = head;
		while(np.next != null) {
			np = np.next;
		}
		np.next = npInsert;
	}
	
	public Node11 reverse() {
		
		Node11 t = head;
		Node11 r = head; 
		Node11 prev = null;
		Node11 temp = t;
		
		if(head == null || head.next==null) {
			return head;
		}
		while(r != null && r.next != null) {
			r = r.next.next;
			prev = t;
			t = t.next;
			temp = t;
		}
		temp = t.next;
		t.next = null;
		Node11 prevCopy = prev;
		prev = t;
		t = temp;
		while(t != null) {
			temp = t.next;
			t.next = prev;
			prev = t;
			t = temp;
		}
		prevCopy.next = prev;
		return head;
		
	}
	
	public void display()
	{
		Node11 np = head;

		while(np != null)
		{
			System.out.print(np.data + " ");
			np = np.next;
		}
	}
	
	public Node11 reverse(Node11 head) {
		if(head ==null || head.next ==null) {
			return head;
		}
		Node11 curr = head;
		Node11 temp = curr;
		Node11 prev = null;
		while(curr!=null) {
			temp = temp.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	public Node11 reverseMiddle() {
		if(head == null || head.next == null) {
			return head;
		}
		// 12 -> 13 -> 14 ==> 12-> | 13->14 ==> 12-> | 14->13 ==> 12->14->13
		// 12->13->14->15 ==> 12->13-> | 14->15 ==> 12->13-> | 15->14 ==> 12->13->15->14
		// first find the middle node
		Node11 t = head;
		Node11 r = head;
		Node11 prev = null;
		while(r!=null && r.next!=null) {
			r = r.next.next;
			prev = t;
			t = t.next;
		}
		prev.next = reverse(t);
		return head;
		
	}
	
	public static void main(String[] args) {

		reverseFromMiddle obj = new reverseFromMiddle();
		obj.insert(23);
		obj.insert(45);
		obj.insert(85);
		obj.insert(56);
		obj.insert(90);
		obj.insert(134);
		obj.insert(11);
		obj.display();
		System.out.println();
		obj.reverse();
		obj.display();
		
		obj.reverseMiddle();
		System.out.println();
		obj.display();
		
	}
}
