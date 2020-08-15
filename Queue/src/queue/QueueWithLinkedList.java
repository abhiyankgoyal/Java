package queue;

/*
 * queue works on FIFO(First In First Out)
 *  
 * */

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class QueueWithLinkedList {

	Node head;
	Node tail;
	
	QueueWithLinkedList()
	{
		this.head = null;
		this.tail = null;
	}
	
	public void add(int val)
	{
		Node npInsert = new Node(val);
		
		if(head == null || tail == null)
		{
			head = npInsert;
			tail = npInsert;
		}
		
		else
		{
			tail.next = npInsert;
			tail = npInsert;
		}
	}
	
	public int remove()
	{
		if(head == null)
		{
			System.out.println("Queue is empty");
			return -1;
		}
		else
		{
			int a = head.data;
			head = head.next;
			
			if(head == null)
			{
				tail = null;
			}
			return a;
		}
	}
	
	public int peek()
	{
		if(head == null)
		{
			System.out.println("Queue is empty");
			return -1;
		}
		else
		{
			return head.data;
		}
	}	
	
	public static void main(String[] args) {
		
		QueueWithLinkedList obj = new QueueWithLinkedList();
		
		obj.add(45);
		obj.add(21);
		obj.add(87);
		obj.add(32);
		
		int val= obj.peek();
		System.out.println(val);
		int removeElement = obj.remove();
		System.out.println(removeElement);
		
		val= obj.peek();
		System.out.println(val);
		removeElement = obj.remove();
		System.out.println(removeElement);
		
		val = obj.peek();
		System.out.println(val);
		removeElement = obj.remove();
		System.out.println(removeElement);
		
		val = obj.peek();
		System.out.println(val);
		removeElement = obj.remove();
		System.out.println(removeElement);
		
		val = obj.peek();
		System.out.println(val);
	}

}
