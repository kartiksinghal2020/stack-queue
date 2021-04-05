package stackAssignment;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackDeclared d= new MyStack();
		System.out.println("Enter Number of values you want in stack:");
		int t =sc.nextInt();
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter your values:");
			d.push(sc.nextInt());
		}
		for(int i=0;i<t;i++)
		{
			System.out.println(d.pop());
		}
		d.push(5);
		System.out.print(d.pop());
		d.push(7);
		d.push(6);
		d.push(7);
		d.push(7);
		d.push(7);
		d.push(6);
		d.push(7);
		d.push(7);
		d.push(7);
		d.push(6);
		d.push(7);
		d.push(7);
		sc.close();

	}

}
