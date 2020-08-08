package Data_Structures;

public class Stack {

	double[] array;
	int point ;
	int maxIndex ;
	
	public Stack(int max) {
		
		point = -1;
		this.maxIndex = max - 1;
		array = new double[max];
	}
	
	public void push(double value) {
		
		if(!isFull()) {
			array[++point] = value;
		}
		else {
			System.out.println("Stack is Full !!!");
		}
	}
	
	public double pop() {
		
		if(!isEmpty()) {
			return array[point--] ;
		}
		else {
			System.out.println("Stack is Empty !!!");
			return -99;
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
	
	public double peek() {
		
		if(!isEmpty())
			return array[point];
		else 
			System.out.println("Stack is Empty !!!");
			return -99;
	}
	
	//peek method using pop() and push()
	public double peek2() {
		
		double val = this.pop();
		this.push(val);
		return val;
	}
}
