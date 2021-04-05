package queueApp;

import java.util.Scanner;

public class TestQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Queue");
		QueueDeclared d = new MyQueue(sc.nextInt());
		d.add(5);
		d.add(6);
		d.add(1);
		d.add(7);
		d.add(8);
		d.add(3);
		d.add(2);
		d.add(5);
		
		System.out.println(d.delete());
		System.out.println(d.delete());
		System.out.println(d.delete());
		System.out.println(d.delete());
		System.out.println(d.delete());
		System.out.println(d.delete());
		System.out.println(d.delete());
		System.out.println(d.delete());
		d.add(7);
		d.add(8);
		d.add(3);
		d.add(2);
		d.add(5);
		sc.close();
		
		

	}

}
