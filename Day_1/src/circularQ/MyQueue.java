package circularQ;

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


    @Override
	public void add(int item)
	{
	    if(((r+1) % size) == f)
	    {
	        System.out.println("Queue is Full");
	    }
	    else
	    {
	        if (r == f && f == -1)
	        {
	            f += 1;
	        }
	        r= (r+1) % size;
	        arr[r] = item;
	    }
	}
	@Override
	public void delete()
	{
	    if(r == f && r == -1)
	    {
	        System.out.println("Queue is Empty.");
	    }
	    else
	    {
	        int item = arr[f];
	        if(r == f)
	        {
	            r = -1;
	            f = -1;
	        }
	        else
	        {
	            f = (f + 1) % size;
	        }
	        System.out.println(item + " is deQueued from the Queue");
	    }
	}
	public void display() {
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);
	}

}
