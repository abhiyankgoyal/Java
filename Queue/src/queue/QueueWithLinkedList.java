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

	Node front;
	Node rear;
	
	QueueWithLinkedList()
	{
		this.front = null;
		this.rear = null;
	}
	
	public void add(int val)
	{
		Node npInsert = new Node(val);
		
		if(front == null || rear == null)
		{
			front = npInsert;
			rear = npInsert;
		}
		
		else
		{
			rear.next = npInsert;
			rear = npInsert;
		}
	}
	
	public int remove()
	{
		if(front == null)
		{
			System.out.println("Queue is empty");
			return -1;
		}
		else
		{
			int a = front.data;
			front = front.next;
			
			if(front == null)
			{
				rear = null;
			}
			return a;
		}
	}
	
	public int peek()
	{
		if(front == null)
		{
			System.out.println("Queue is empty");
			return -1;
		}
		else
		{
			return front.data;
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
