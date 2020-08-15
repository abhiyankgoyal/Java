package recursion;

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

public class LinkedListSum {

	static Node head;

	LinkedListSum(){
		this.head = null;
	}


	public void insert(int val)
	{
		Node np=head;

		if(head == null)
		{
			Node npInsert = new Node(val);
			head = npInsert; 
		}
		else
		{
			insertAtLast(val);
		}

	}

	public void insertAtLast( int val)
	{
		Node np = head;

		Node npInsert = new Node(val);

		while(np.next != null)
		{
			np = np.next;
		}
		np.next = npInsert;
	}
	
	public int add(Node head)
	{
		if(head == null)
		{
			return 0;
		}
		int prevSum = add(head.next); 
		return prevSum + head.data;
	}
	
	public static void main(String[] args) {
		
		LinkedListSum obj = new LinkedListSum();
		 
		obj.insert(23);
		obj.insert(45);
		obj.insert(11);
		obj.insert(22);
		
		int sum = obj.add(head);
		System.out.println(sum);
	}

}
