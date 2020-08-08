package Lab02;

public class QueueX {

	private int front;
	private int rear;
	private int maxSize;
	private int noItems;
	private int queueArr[];
	

	public QueueX(int s) {
		
		this.front = 0;
		this.rear = -1;
		queueArr = new int[s];
		this.noItems = 0;
		this.maxSize = s;
	}
	
	public void insert(int j) {
		
		if(noItems != maxSize) {
			if(rear == maxSize - 1 )
				rear = -1;
			
			queueArr[++rear] = j;
			++noItems ;
		}
		else
			System.out.println("Queue is full!!!");
	}
	
	public int remove() {
		
		if(noItems != 0) {
			--noItems;
			
			if(front == maxSize - 1) {
				front = 0;
				return queueArr[maxSize - 1];
			}
			else
				return queueArr[front++];
		}
		else
			System.out.println("Queue is empty!!!");
			return (Integer) null;
	}
	
	
	public boolean isEmpty() {
		
		if(noItems == 0)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		
		if(noItems == maxSize)
			return true;
		else
			return false;
	}
}
