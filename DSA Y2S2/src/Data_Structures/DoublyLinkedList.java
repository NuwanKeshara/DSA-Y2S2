package Data_Structures;

public class DoublyLinkedList {

	public static void main(String[] args) {
		
		
	}
}

class Links{
	
	private int iData;
	public Links next ;
	public Links previous;
	
	public Links(int id) {
		
		iData = id;
		next = null;
		previous = null;
	}
	
	public void displayLinks() {
		
		System.out.println(iData);
	}
}

class DoublyLinkList{
	
	private Links first;
	
	public DoublyLinkList() {
		
		first = null;
	}
	
	public void insertFirst(int id) {
		
		Links link = new Links(id);
		link.next = first;
		first.previous = link;
		first = link;
	}
	
	
	public Links deleteFirst() {
		
		if(first != null) {
			Links temp = first;
			first = first.next;
			first.previous = null;
			
			return temp;
		}
		else
			return null;
	}
	
	
	public void displayDoublyLinkList() {
		
		Links current = first;
		
		while(current != null) {
			
			current.displayLinks();
			current = current.next;
		}
	}
}