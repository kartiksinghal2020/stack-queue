package stackAssignment;

public class MyStack implements StackDeclared {
	int[] arr;
	int top;
	int size;
	
	MyStack(){
		arr = new int[10];
		top=-1;
		size=10;
	}

	@Override
	public void push(int i) {
		if(fullStack()) {
			return;
		}
		++top;
		arr[top]=i;
		System.out.println("Element pushed");

	}

	@Override
	public int pop() {
		if(emptyStack()) {
			return -1;
		}
		int i=arr[top];
		--top;
		System.out.print("Element Popped ->");
		return i;
	}

	@Override
	public boolean emptyStack() {
		if(top == -1) {
			System.out.println("Stack is empty");
			return true;
		}
		return false;
	}

	@Override
	public boolean fullStack() {
		if(top ==(size -1)) {
			System.out.println("Stack is full");
			return true;
		}
		return false;
	}

}
