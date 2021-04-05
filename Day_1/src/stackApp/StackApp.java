package stackApp;

public class StackApp {

	public static void main(String[] args) {
		StackIntf s =new MyStack();
		
		s.push(5);
		s.push(20);
		s.push(11);
		
		while(!s.isEmpty()) {
			s.pop();
		}

	}

}
