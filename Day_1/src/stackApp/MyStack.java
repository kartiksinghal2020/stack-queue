package stackApp;

public class MyStack implements StackIntf {
	int[] arr;
	int top;
	int size;
	
	MyStack(){
		arr = new int[10];
		size=10;
		top= -1;
	}

	/*
	 * @Override public void initStack(int s) {
	 * System.out.println("initialisation of Stack");
	 * 
	 * }
	 */

	@Override
	public void push(int n) {
		if(isFull()) {
			return;
		}
		System.out.println("Push Element");
		++top;
		arr[top]=n;

	}

	@Override
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		System.out.println("Pop Element");
		int t =arr[top];
		--top;
		return t;
	    
		
	}

	@Override
	public boolean isEmpty() {
		System.out.println("isEmpty");
		if(top == -1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		System.out.println("isfull");
		if(top == (size-1)) {
			return true;
		}
		return false;
	}

}
