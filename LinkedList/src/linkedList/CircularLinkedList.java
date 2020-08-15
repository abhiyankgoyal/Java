package linkedList;

class Node4 {
	int data;
	Node4 next;

	Node4(int data) {
		this.data = data;
		this.next = null;
	}
}

public class CircularLinkedList {

	Node4 head;

	CircularLinkedList() {
		head = null;
	}

	public void insert(int val) {

		if (head == null) {
			Node4 npInsert = new Node4(val);
			head = npInsert;
			npInsert.next = head;
			/*
			 * Below all three are correct because both npInsert and head points to same node
			 * */
			// head.next =  npInsert;
			// npInsert.next = npInsert;
			// head.next  = head;
		}
		
		else
		{
			Node4 npInsert = new Node4(val);
			
			Node4 np = head;
			
			while(np.next != head)
			{
				np = np.next;
			}
			
			np.next = npInsert;
			npInsert.next = head;
			//System.out.println(head.data + " "+ ((head.next!=head) ? head.next.data : null) + " "+ ((head.next.next!=head) ? head.next.next.data : null));
			
		}
	}
	
	public void display()
	{
		
		Node4 np = head;
		
//		if(np.next == head)
//		{
//			System.out.println(np.data+ " ");
//		}
		
	//	else
	//	{
			//System.out.println(head.data + " " + head.next.data + " "+ head.next.next.data);
			do
			{
				System.out.println(np.data+ " ");
				np = np.next;
			}while(np!=head);
	//	}

	}

	public static void main(String[] args) {
		
		CircularLinkedList cl = new CircularLinkedList();
		
		cl.insert(23);
		System.out.println("-----");
		cl.display();
		System.out.println("----");
		cl.insert(45);
		//cl.display();
		cl.insert(76);
		
		cl.display();

	}

}
