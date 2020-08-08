package Data_Structures;

public class LinearQueue {

	int max;
	int front;
	int rear;
	int noOfItems;
	int[] queue;
	
	public LinearQueue(int max) {
		
		this.max = max;
		this.front = 0;
		this.rear = -1;
		this.noOfItems = 0 ;
		this.queue = new int[max];
	}
	
	public void insert(int num) {
		
		if(!isFull()) {
			
			queue[++rear] = num;
			++noOfItems;
		}
		else {
			System.out.println("Can not add elements!!!");
		}
		
		show();
	}
	
	public boolean isFull() {

		if(rear == max -1 ) {
			
			return true;
		}
		else
			return false;
	}

	public int remove() {
		
		if(!isEmpty()) {
			
			--noOfItems;
			return queue[front++];
		}
		else {
			
			System.out.println("No elements!!!\n");
			return (Integer) null;
		}
	}
	
	public int peek() {
		
		if (!isEmpty()) {
			
			show();
			return queue[front];
		}
		else {
			
			System.out.println("No elements!!!\n");
			return (Integer) null;
		}
	}

	public boolean isEmpty() {

		if(rear == -1 || front == max) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	public void show() {
		
		for(int num : queue) {
			System.out.print(num);
		}
		System.out.println();
	}
	
	
}

class mainX{
	
	public static void main(String[] args) {
		
		LinearQueue Lqueue = new LinearQueue(5);
		Lqueue.insert(1);
		Lqueue.insert(2);
		Lqueue.insert(3);
		Lqueue.insert(4);
		Lqueue.insert(5);
		
		while(!Lqueue.isEmpty()) {
			
			Lqueue.remove();
		}
		
		Lqueue.insert(55);
		System.out.println(Lqueue.isEmpty());
		System.out.println(Lqueue.isFull());
	}
}