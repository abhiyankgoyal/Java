package linkedList;

class Node5{
	int data;
	Node5 next;
	Node5 prev;
	
	Node5(int data){
		this.data = data;
		next = null;
		prev = null;
	}
}

public class DoublyLinkedList {

	Node5 head;
	
	DoublyLinkedList()
	{
		this.head = null;
	}
	
	public Node5 insert(int data) 
	{	
		Node5 npInsert = new Node5(data);
		if(head == null) 
		{
			head = npInsert;
		}
		else 
		{
			Node5 np = head;
			while(np.next != null) 
			{
				np = np.next;
			}
			np.next = npInsert;
			npInsert.prev = np;
		}
		return head;
	}
	
	public Node5 insertAtFront(int data) {
		
		Node5 npInsert = new Node5(data);
		
		npInsert.next = head;
		head.prev = npInsert;
		head = npInsert;
		
		return head;
	}
	
	public void insertInBetween(int data, int pos) {
		Node5 npInsert = new Node5(data);
		Node5 np = head;
		int count = 1;
		while(count != pos-1) {
			np = np.next;
		}
		
		npInsert.next = np.next;
		npInsert.prev = np;
		np.next = npInsert;
	}
	
	public void display() 
	{	
		if(head == null) 
		{
			System.out.println("Dll is empty");
		}
		else 
		{
			Node5 np = head;
			while(np != null) 
			{
				System.out.print(np.data + " ");
				np = np.next;
			}
		}
	}
	
	public void reverseDisplay() 
	{
		if(head == null) 
		{
			System.out.println("Dll is empty");
		}
		else 
		{
			Node5 np = head;
			while(np.next != null) 
			{
				np = np.next;
			}
			while(np !=null) 
			{
				System.out.print(np.data + " ");
				np = np.prev;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insert(1);
		dll.insert(2);
		dll.insert(3);
		dll.display();
		System.out.println();
		dll.reverseDisplay();
		System.out.println();
		dll.insertAtFront(0);
		dll.display();
		System.out.println();
		dll.reverseDisplay();
	}

}
