package Lab03;

public class A {

	public static void main(String[] args) {
		
//		Link link1 = new Link("Nipuna" , 53.5);
//		Link link2 = new Link("Aravinda" , 78.0);
//		Link link3 = new Link("Prashani" , 69.5);
//		
//		link1.next = link2;
//		link2.next = link3;
//		
//		Link current = link1;
//		while(current != null) {
//			
//			current.displayDetails();
//			current = current.next;
//		}
//		
//		System.out.println();
		
		LinkList list = new LinkList();
		list.insertFirst("Prashani" , 69.5);
		list.insertFirst("Aravinda" , 78.0);
		list.insertFirst("Nipuna" , 53.5);
		list.insertFirst("Dumb" , 12.2);
		list.insertFirst("Smart" , 98.0);
		
		list.displayList();
		
		Link x =list.deleteLink("Dumb");
		try {
			x.displayDetails();
		}
		catch(Exception e) {}
			
		list.displayList();
	}

}

class Link{
	
	private String name;
	private double avg;
	public Link next;
	
	public Link(String name ,double avg) {
		
		this.name = name;
		this.avg = avg;
		next = null;
	}
	
	public void displayDetails() {
		
		System.out.println(name);
		System.out.println(avg + "\n");
	}
	
	public String getName() {
		
		return name;
	}
}


class LinkList{
	
	private Link first;
	
	
	public LinkList() {
		
		first = null;
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
			
			current.displayDetails();
			current = current.next;
			
		}
	}
	
	public void insertFirst(String name , double avg) {
		
		Link link = new Link(name , avg);
		if(isEmpty()) {
			
			first = link;
		}
		else {
			
			link.next = first;
			first = link;
			
		}
	}
	
	public Link deleteFirst() {
		
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public Link deleteLink(String name) {
		
		Link temp;
		Link current = first;
		Link previous = first;
		
		while(current != null) {
			
			if(current.getName() == name) {
				
				if(current == first)
					first = current.next;
				else	
					previous.next  = current.next;
				
				temp = current;
				return temp;
			}
			previous = current;
			current = current.next;
		}
		
		System.out.println("No matches found \n");
		return null;
	}
}


