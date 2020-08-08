package Lab01;

public class StackCharacter {

	char[] array;
	int point ;
	int maxIndex ;
	
	public StackCharacter(int max) {
		
		point = -1;
		this.maxIndex = max - 1;
		array = new char[max];
	}
	
	public void push(char value) {
		
		if(!isFull()) {
			array[++point] = value;
		}
		else {
			System.out.println("Stack is Full !!!");
		}
	}
	
	public char pop() {
		
		if(!isEmpty()) {
			return array[point--] ;
		}
		else {
			System.out.println("Stack is Empty !!!");
			return (Character) null;
		}
	}
	
	public boolean isEmpty() {
		
		if(point == -1)
			return true;
		else 
			return false;
	}
	
	public boolean isFull() {
		
		if(point == maxIndex)
			return true;
		else
			return false;
	}
	
	public char peek() {
		
		if(!isEmpty())
			return array[point];
		else 
			System.out.println("Stack is Empty !!!");
			return (Character) null;
	}
}
