
package datastructure;


public class StackCustom {
	int size;
	int arr[];
	int top;

	StackCustom(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int pushedElement) {
		if (!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed element:" + pushedElement);
		} else {
			System.out.println("Stack is full !");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			return arr[returnedTop];

		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public static void main(String[] args) {
		StackCustom stackCustom = new StackCustom(4);
		stackCustom.pop();
		System.out.println("=================");
		stackCustom.push(40);
		stackCustom.push(30);
		stackCustom.push(50);
		stackCustom.push(90);
		System.out.println("=================");
		
//		StackCustom sc = sortStack(stackCustom);
//		System.out.println(sc.arr.length);
//		for (int i: sc.arr)
//			sc.pop();
		
		
		
		stackCustom.pop();
		stackCustom.pop();
		stackCustom.pop();
		stackCustom.pop();
		System.out.println("=================");
		
	}

	public static StackCustom sortStack(StackCustom stack)
	{
		StackCustom tempStack = new StackCustom(4);
		while(!stack.isEmpty())
		{
			int currentData=stack.pop();
			while(!tempStack.isEmpty() && tempStack.peek() > currentData) {
				stack.push(tempStack.pop());
			}
			tempStack.push(currentData);
		}
		return tempStack;
	}
}
