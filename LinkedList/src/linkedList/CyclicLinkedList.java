package linkedList;
//to check whether a cycle exist is linked list or not
//by tortoise rabbit method

import java.util.LinkedList;

class Node10{
	int data;
	Node10 next;
	
	Node10(int data){
		this.data = data;
		this.next = null;
	}
}

public class CyclicLinkedList {
	
	Node10 head;
	
	CyclicLinkedList(){
		this.head = null;
	}
	
	public Node10 insert(int data) {
		
		Node10 npInsert = new Node10(data);
		
		if(head == null)
		{
			head = npInsert; 
		}
		else
		{
			insertAtLast(npInsert);
		}
		return head;
	}
	
	public void insertAtLast(Node10 npInsert) {
		
		Node10 np = head;
		while(np.next != null) {
			np = np.next;
		}
		np.next = npInsert;
		
	}

	public boolean checkCycle() {
		
		Node10 tortoise = head;
		Node10 rabbit = head;
		if(head == null) {
			return false;
		}
		else {
			
			 do{
				rabbit = rabbit.next.next;
				tortoise = tortoise.next;
				if(rabbit == null || rabbit.next == null) {
					return false;
				}
			}while(rabbit != tortoise);
			 
			return true;
			
		}
		//return true;
	}
	
	public void makeCycle() {
		
		Node10 np = head;
		
		while(np.next != null) {
			np = np.next;
		}
		np.next = head.next;
	}
	
	
	public boolean checkCycle2() {
		Node10 tortoise = head;
		Node10 rabbit = head;
		
		while(rabbit != null && rabbit.next != null) {
			rabbit = rabbit.next.next;
			tortoise = tortoise.next;
			if(rabbit == tortoise) {
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LinkedList ll2 = new LinkedList();
//		ll2.add(43);
//		ll2.add(12);
//		ll2.add(24);
//		ll2.add(65);
//		ll2.add(91);
//		CyclicLinkedList obj = new CyclicLinkedList();
//		System.out.println(ll2.get(0));
//		boolean res=obj.checkCycle(ll2.get(0));
		CyclicLinkedList obj = new CyclicLinkedList();
		//Node head =  null; 
		obj.insert(23);
		obj.insert(45);
		obj.insert(85);
		obj.insert(56);
		//obj.insert(12);
		System.out.println(obj.checkCycle());
		obj.makeCycle();
		System.out.println(obj.checkCycle());
		System.out.println(obj.checkCycle2());
	}

	

}
