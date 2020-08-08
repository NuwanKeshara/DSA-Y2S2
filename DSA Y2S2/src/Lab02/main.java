package Lab02;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		QueueX mainQueue = new QueueX(5);
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		
		Scanner myScanner = new Scanner(System.in);
		
		for (int i = 1 ; i < 6 ; ++i) {
		
			System.out.print("Enter transaction ID "+ i + ": ");
			mainQueue.insert( myScanner.nextInt() );
			
		}
		
		while(!mainQueue.isEmpty()) {
			int val = mainQueue.remove();
			
			if( val % 2 == 0) {
				evenQueue.insert(val);
			}
			else
				oddQueue.insert(val);
		}
		
		
		System.out.println("PC1");
		while(!evenQueue.isEmpty())
			System.out.println("\tTransaction " + evenQueue.remove());
		
		System.out.println("PC2");
		while(!oddQueue.isEmpty())
			System.out.println("\tTransaction " + oddQueue.remove());
				
		
		
	}

}
