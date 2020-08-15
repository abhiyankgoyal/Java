package linkedList;

class Node3 {
	int val;
	Node3 next;
	
	Node3(int val) {
		this.val = val;
		this.next = null;
	}
}
public class LinkedList3 {
	
	Node3 head;
	
	LinkedList3(){
		this.head = null;
	}
	
	
	public void insert(int val)
	{
		if(head == null)
		{
			Node3 npInsert = new Node3(val);
			head = npInsert; 
		}
		else
		{
			insertAtLast(val);
		}
	
	}
	
	public void insertAtLast( int val)
	{
		Node3 np = head;

		Node3 npInsert = new Node3(val);

		while(np.next != null)
		{
			np = np.next;
		}
		np.next = npInsert;
	}
	
	public void display()
	{
		Node3 np = head;

		while(np != null)
		{
			System.out.println(np.val + " ");
			np = np.next;
		}
	}


	public static void main(String[] args) {
		LinkedList3 obj = new LinkedList3();
		//Node head =  null; 
		obj.insert(23);
		obj.insert(45);
		obj.display();
		System.out.println("----------");
		LinkedList3 obj2 = new LinkedList3();
		//Node head2 = null;
		obj2.insert(11);
		obj2.insert(22);
		obj2.display();
	}

}
