package Stack;

//all push and pop operation should be O(1)
public class StackWithArray {
	
	int[] arr;
	int top;
	
	StackWithArray()
	{
		arr = new int[5];
		top = -1;
	}
	
	public void push(int val)
	{
		int n = arr.length;
		
		if(top < n-1)
		{
			top ++;
			arr[top] = val;
		}
		else
		{
			System.out.println("Stack is full");
		}
	}
	
	public int pop()
	{
		if(top == -1)
		{
			System.out.println("stack is empty");
			return -1;
		}
		else
		{
			int a = arr[top];
			top--;
			return a;
		}
	}

	public int peek()
	{
		if(top == -1)
		{
			System.out.println("stack is empty");
			return -1;
		}
		else
		{
			return arr[top];
		}
	}
	
	public void display()
	{
		if(top == -1) {
			System.out.println("Stack is empty");
			return;
		}
		for(int i=0; i<=top; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		StackWithArray obj = new StackWithArray();
		
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		//obj.push(6);
		
		System.out.println("Stack is :");
		
		obj.display();
		
		int popElement = obj.pop();
		System.out.println(popElement);
		int val= obj.peek();
		System.out.println(val);
		obj.display();
		
		popElement = obj.pop();
		System.out.println(popElement);
		val = obj.peek();
		System.out.println(val);
		obj.display();
		
		popElement = obj.pop();
		System.out.println(popElement);
		val = obj.peek();
		System.out.println(val);
		obj.display();
		
		popElement = obj.pop();
		System.out.println(popElement);
		val = obj.peek();
		System.out.println(val);
		obj.display();
		
		popElement = obj.pop();
		System.out.println(popElement);
		val = obj.peek();
		System.out.println(val);
		obj.display();
	
	}

}
