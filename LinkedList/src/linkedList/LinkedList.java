package linkedList;


class Node
{
	int data ;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		next = null;
	}
}

public class LinkedList {
	
//	Node head;
//	
//	LinkedList()
//	{
//		this.head = null; // doubt
//	}
	
//	public void insertAtLast(int val)
//	{
//		Node npInsert = new Node(val);
//		
//		if(head==null)
//		{
//			head = npInsert;
//		}
//		
//		else
//		{
//			Node np = head;
//			
//			while(np.next != null)
//			{
//				np = np.next;
//			}
//			np.next = npInsert; 
//		}
//		
//	}
	
	public void display(Node head)
	{
		Node np = head;
		
		if(head == null) {
			return;
		}
		while(np != null )
		{
			System.out.print(np.data+ " ");
			np = np.next;
		}
	}
	
	public Node insertAtFirst(Node head, int val)
	{
		Node npInsert = new Node(val);
		
		npInsert.next = head;
		head = npInsert;
		return head;
	}
	
	public void replaceValAtNode(Node head, int pos, int val)
	{
		Node np = head;
		
		int count = 1;
		
		while(count != pos)
		{
			count ++;
			np = np.next;
		}
		
		np.data = val ;
	}
	
	public void insertAtLast(Node head, int val)
	{
		Node npInsert = new Node(val);
		
		Node np = head;
		
		while(np.next != null)
		{
			np = np.next;
		}
		
		np.next = npInsert;
	}
	
	public Node insert(Node head, int val)
	{
		//Node npInsert = new Node(val);
		
		if(head == null)
		{
			//Node npInsert = new Node(val);
			//head = npInsert;
			
			Node head1 = insertAtFirst(head , val);
			return head1;
		}
		
//		else
//		{
//			Node np = head;
//			
//			while(np.next != null)
//			{
//				np = np.next;
//			}
//			
//			np.next = npInsert;
//		}
		else
		{
			insertAtLast(head, val);
		}
		return head;
	}
	

	public static void main(String[] args) {
		
		LinkedList obj = new LinkedList();
		
		Node n1 = new Node(56);
		Node n2 = new Node(24);
		Node n3 = new Node(33);
		Node n4 = new Node(45);
		
		Node head = n1 ;
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		System.out.print("Linked List : ");
		
		obj.display(head);
		System.out.println();
		
		head = obj.insertAtFirst(head,78); // here copy of head goes..not the actual reference of head.. therefore if head is changed in the function then head reference must be changed.
		
		System.out.print("new Linked List : ");
		
		obj.display(head);
		
		obj.replaceValAtNode(head, 2, 100);
		
		System.out.print("\nnew Linked List : ");
		
		obj.display(head);
		
		obj.insertAtLast(head, 200);
		
		System.out.print("\nnew Linked List : ");
		
		obj.display(head);
		
//		Node head = null;
//		
//		head = obj.insert(head , 56);
//		head = obj.insert(head, 24);
//		head = obj.insert(head, 36);
//		head = obj.insert(head, 89);
//		
//		obj.display(head);
		
	}

}
