package Data_Structures;

public class CircularQueue {
	
	private int front;
	private int rear;
	private int max;
	private int noOfItems;
	private int[] queue;
	

	public CircularQueue(int max) {
		
		this.front = 0;
		this.rear = -1;
		queue = new int[max];
		this.noOfItems = 0;
		this.max = max;
	}
	
	public void insert(int value) {
		
		if(noOfItems != max) {
			if(rear == max-1)
				rear = -1;
			
			queue[++rear] = value;
			++noOfItems ;
		}
		else
			System.out.println("Queue is full!!!");
	}
	
	public int remove() {
		
		if(noOfItems != 0) {
			--noOfItems;
			
			if(front == max - 1) {
				front = 0;
				return queue[max - 1];
			}
			else
				return queue[front++];
		}
		else
			System.out.println("Queue is empty!!!");
			return (Integer) null;
	}
	
	public int peek() {
		
		if(noOfItems != 0) {
			return queue[front];
		}
		else
			System.out.println("Queue is empty!!!");
			return (Integer) null;
	}
	
	public boolean isEmpty() {
		
		if(noOfItems == 0)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		
		if(noOfItems == max)
			return true;
		else
			return false;
	}

}

class Main{
	
	public static void main(String[] args) {
		
		CircularQueue Cq = new CircularQueue(5);
		Cq.insert(1);
		Cq.insert(2);
		Cq.insert(3);
		Cq.insert(4);
		Cq.insert(5);
		Cq.insert(6);
		Cq.remove();
		Cq.remove();
		Cq.insert(7);
		
		while(!Cq.isEmpty()) {
			System.out.println(Cq.remove());
		}
		
		System.out.println(Cq.isEmpty());
		System.out.println(Cq.isFull());
	}
}
