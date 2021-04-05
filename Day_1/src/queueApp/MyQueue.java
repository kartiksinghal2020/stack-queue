package queueApp;

public class MyQueue implements QueueDeclared {
	
	int[] arr;
	int f;
	int r;
	int size;
	
	MyQueue(int n){
		arr = new int[n];
		size=n;
		f=-1;
		r=-1;
	}

	
	public void add(int n) {
		if(isFull())
			System.out.println("queue is full");
		if(f == -1 && r == -1)
			r=f=0;
		else
			++r;
		arr[r]=n;
		System.out.println("Added");
		  	
		

	}

	@Override
	public int delete() {
		if(isEmpty())
			System.out.println("queue is Empty");
		int t =arr[f];
		++f;
		return t;
	}

	@Override
	public boolean isEmpty() {
		if(f < 0 || f > r) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isFull() {
		if(r == (size-1)) {
			return true;
		}
		
		return false;
	}

}
