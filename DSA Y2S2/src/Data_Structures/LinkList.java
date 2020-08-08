package Data_Structures;

class Link{

	private int iData;
	public Link next;
	
	public Link(int id) {
		
		iData = id;
		next = null;
	}
	
	public void displayLink() {
		
		System.out.println(iData);
	}
}

class LinkedList{
	
	private Link first;
	
	public LinkedList() {
		
		first = null;
	}
	
	public void insertFirst(int id) {
		
		Link link = new Link(id);
		link.next = first;
		first = link;
	}
	
	public Link deleteFirst() {
		
		if(isEmpty())
			return null;
		else {
			Link temp = first;
			first = first.next;
			return temp;
		}
	}
	
	public boolean isEmpty() {
		
		if(first == null)
			return true;
		else
			return false;
	}
	
	
	public void displayList() {
		
		Link current = first;
		while(current != null) {
			
			current.displayLink();
			current = current.next;
		}
	}
}

public class LinkList{
	
	public static void main(String[] args) {
		
		LinkedList theList = new LinkedList();
		
		theList.insertFirst(23);
		theList.insertFirst(89);
		theList.insertFirst(12);
		theList.insertFirst(55);
		
		theList.displayList();
		
		while(!theList.isEmpty()) {
			
			Link aLink = theList.deleteFirst();
			System.out.print("Deleted ");
			aLink.displayLink();
		}
	}
}





