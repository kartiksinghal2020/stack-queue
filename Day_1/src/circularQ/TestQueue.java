package circularQ;

import java.util.Scanner;

public class TestQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Queue");
		int l =sc.nextInt();
		QueueDeclared d = new MyQueue(l);
		boolean exit =false;
		while(!exit) 
		{
			System.out.println("Enter your choice: \n 1.Add Element \n 2.Delete Element \n 3. Display");
			switch(sc.nextInt()) 
			{
			case 1:
				d.add(sc.nextInt());
				break;
			case 2:
				d.delete() ;
				break;
			case 3:
				d.display();
				break;
			default:
				System.out.println("Invalid Input");
				exit=false;
			}
		}
		sc.close();
		
		

	}

}
