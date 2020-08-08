package Tutorial3;

public class Q1 {

	private static Link first;
	
	public static void main(String[] args) {
		
		Link l1 = new Link("Mithila");
		Link l2 = new Link("Akila");
		Link l3 = new Link("Mihiri");
		Link l4 = new Link("Nisha");
		
		first = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		
		display();
		System.out.println();
		
		first = l3;
		l3.next = l2;
		l2.next = l1;
		l1.next = l4;
		
		display();
		
	}
	
	public static void display() {
		
		Link current = first;
		while(current != null) {
			
			current.displayLink();
			current = current.next;
		}
	}

}

class Link{
	
	private String name;
	public Link next;
	
	public Link(String name) {
		this.name = name;
		next = null;
	}
	
	public void displayLink() {
		System.out.println(name);
	}
}
