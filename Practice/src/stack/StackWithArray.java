package stack;

public class StackWithArray {
	
	int[] arr;
	int top;
	
	StackWithArray(){
		arr = new int[5];
		top=-1;
	}
	
	public void push(int val) {
		
		if(top < arr.length - 1){
			top++;
			arr[top]=val;
		}
		else {
			System.out.println("stack is full can't add more data");
		}
	}
	
	public int pop() {
		
		if(top == -1) {
			System.out.println("stack is empty");
			return 0;
		}
		else {
			int popData = arr[top];
			top--;
			return popData;
		}
		
	}
	
	public void peek() {
		if(top == -1) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println(arr[top]);
		}
	}

	public void display() {
		
		if(top == -1) {
			System.out.println("stack is empty");
		}
		else {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithArray obj = new StackWithArray();
		obj.push(89);
		obj.push(12);
		obj.push(34);
		obj.push(78);
		obj.push(5);
		obj.display();
		System.out.println();
		obj.push(23);
		System.out.println(obj.pop());
		obj.peek();
	}

}
