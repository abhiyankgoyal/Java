package linkedList;

class Node5
{
	int data;
	Node5 next;
	Node5 prev;
	
	Node5(int data)
	{
		this.data = data;
		this.next = null;
		this.prev = null;
	}

}

public class DoublyLinkedList {
	
	Node5 head;
	
	DoublyLinkedList()
	{
		this.head = null;
	}
	
	
	public void insert(int val)
	{
		Node5 npInsert = new Node5(val);
		
		if(head == null)
		{
			head = npInsert;
			// OR
			//head = new Node5(val);
			return;
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
			// OR
			//np.next = new Node5(val);
			//np.next.prev = np;
		}
		
	}
	
	public void insertInBetween(int val, int pos) {
		Node5 npInsert = new Node5(val);
		int count = 1;
		Node5 np = head;
		while(count != pos-1) {
			np = np.next;
		}
		npInsert.next = np.next;
		np.next = npInsert;
		npInsert.prev = np;
	}
	
	public void display()
	{
		Node5 np = head;
		
		while (np != null)
		{
			System.out.print(np.data+ " ");
			np = np.next;
		}
	}
	
	public void reverseDisplay()
	{
		Node5 np =head;
		
		while(np.next != null)
		{
			np = np.next;
		}
		
		while(np != null)
		{
			System.out.print(np.data + " ");
			np = np.prev;
		}
		
		
	}
	
	

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.insert(12);
		dll.insert(45);
		dll.insert(78);
		
		dll.display();
		
		System.out.println();
		
		dll.reverseDisplay();

	}

}
