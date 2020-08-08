package Tutorial3;

public class Q3 {

	public static void main(String[] args) {
		

	}

}

class DoubleEndedLink{
	
	public DoubleEndedLink next;
	public DoubleEndedLink previous;
	public int id;
	
	public DoubleEndedLink(int id) {
		
		next = null;
		previous = null;
		this.id = id;
	}
	
	public void displayLink() {
		
		System.out.println(id);
	}
}

class DoubleEndedLinkList{
	
	private DoubleEndedLink first;
	private DoubleEndedLink last;
	
	public DoubleEndedLinkList() {
		
		first = null;
		last = null;
	}
	
	public void insertFirst(int id) {
		
		DoubleEndedLink link = new DoubleEndedLink(id);
		
		if(first == null) {
			last = link;
			first = link;
		}
		else {
			link.next = first;
			first.previous = link;
			first = link;
		}
		
		
	}
	
	public DoubleEndedLink deleteFirst() {
		
		if(first != null) {
			
			DoubleEndedLink temp = first;
			first.next.previous = null;
			first = first.next;
			return temp;
		}
		else
			return null;
	}
	
	public void inserLast(int id) {
		
		if(first == null)
			insertFirst(id);
		else {
			DoubleEndedLink link = new DoubleEndedLink(id);
			link.previous = last;
			last.next = link;
			last = link;
		}
			
	}
}