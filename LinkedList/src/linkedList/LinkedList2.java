package linkedList;

class Node1
{
	int data ;
	Node1 next;

	Node1(int data)
	{
		this.data = data;
		next = null;
	}
}

public class LinkedList2
{

	public Node1 insert(Node1 head, int val)
	{
		
		if(head == null)
		{
			Node1 npInsert = new Node1(val);
			head = npInsert; 
		}
		else
		{
			insertAtLast(head, val);
		}
		return head;
	}

	public void insertAtLast(Node1 head, int val)
	{
		Node1 np = head;

		Node1 npInsert = new Node1(val);

		while(np.next != null)
		{
			np = np.next;
		}
		np.next = npInsert;
	}

	public void display(Node1 head)
	{
		Node1 np = head;

		while(np != null)
		{
			System.out.println(np.data + " ");
			np = np.next;
		}
	}

	public Node1 delete(Node1 head, int pos)
	{
		Node1 np = head;
		
		if(head == null)
		{
			return head;
		}

		else if(pos == 1)
		{
			//head = np.next;
			head = deleteFromBegining(head);

		}

		else
		{

			int count = 1;

			while(np!=null && count != pos-1)
			{
				count++;
				np=np.next;
			}
			
			if(np == null)
			{
				return head; // not be able to delete node which is not in linked list
			}

			if(np.next == null)
			{
				return head; // not be able to delete node which is null 
			}

			else
			{
				Node1 adjacent = np.next.next;
				np.next = adjacent;
			}
		}
		return head;
	}
	
	public Node1 deleteFromBegining(Node1 head)
	{
		Node1 np = head;
		head = np.next;
		return head;
	}
	
	public void joinLinkedLists(Node1 head1, Node1 head2)
	{
		Node1 np = head1;
		
		while(np.next != null )
		{
			np = np.next;
		}
		
		np.next = head2;
		
	}

	public static void main(String[] args) {

		LinkedList2 obj1 = new LinkedList2();

		Node1 head1 = null;
		
		Node1 head2 = null;

		head1 = obj1.insert(head1, 33);
		obj1.insert(head1, 21);
		obj1.insert(head1, 78);
		obj1.insert(head1, 45);
		
		System.out.println("linked list 1: ");

		obj1.display(head1);

		head1 = obj1.delete(head1, 4);
		
		System.out.println("new linked list 1: ");

		obj1.display(head1);
		
		LinkedList2 obj2 = new LinkedList2();
		
		head2 = obj2.insert(head2, 67);
		obj2.insert(head2,37);
		obj2.insert(head2, 89);
		obj2.insert(head2, 11);
		
		System.out.println("linked list 2: ");
		
		obj2.display(head2);
		
		LinkedList2 obj3 = new LinkedList2();
		
		obj3.joinLinkedLists(head1, head2);
		
		System.out.println("linked list 3: ");
		
		obj3.display(head1);
		
	}

}		
