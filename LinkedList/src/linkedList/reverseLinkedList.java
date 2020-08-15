package linkedList;

class Node6{
	
	int data;
	Node6 next;
	
	Node6(int data){
		this.data = data;
		next = null;
	}
}

public class reverseLinkedList {
	
	Node6 head;
	
	reverseLinkedList(){
		head = null;
	}
	
	public void insert(int val)
	{
		if(head == null)
		{
			Node6 npInsert = new Node6(val);
			head = npInsert; 
		}
		else
		{
			insertAtLast(val);
		}
	
	}
	
	public void insertAtLast( int val)
	{
		Node6 np = head;

		Node6 npInsert = new Node6(val);

		while(np.next != null)
		{
			np = np.next;
		}
		np.next = npInsert;
	}
	
	public void display()
	{
		Node6 np = head;

		while(np != null)
		{
			System.out.print(np.data + " ");
			np = np.next;
		}
	}
	
	public void reverse() {
		if(head == null) {
			System.out.println("linkedlist is empty");
		}
		else{
			Node6 prev = null;
			Node6 next = null;
			Node6 np = head;
			
			while(np != null) {
				next = np.next;
				np.next = prev;
				prev = np;
				np = next;
			}
			head = prev;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseLinkedList obj = new reverseLinkedList();
		obj.insert(23);
		obj.insert(45);
		obj.insert(34);
		obj.insert(87);
		obj.display();
		System.out.println();
		obj.reverse();
		obj.display();
	}

}
