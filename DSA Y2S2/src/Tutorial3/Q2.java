package Tutorial3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		LinkList list = new LinkList();
		
		Scanner scn = new Scanner(System.in);
		
		while(true){
		System.out.print("Enter a number (to end enter -1) : ");
		int id = scn.nextInt();
		
		if(id == -1)
			break;
		list.insertFirst(id);
		}
		
		list.displayList();
		System.out.println();
		
		list.insertAfter(1 , 2);
		list.displayList();
		System.out.println();
		
		Links l = list.delete(2);
		System.out.print("Deleted : "  );
		l.displayLinks();
		list.displayList();
		
		
	}

}

class Links{
	
	public int iData;
	public Links next;
	
	public Links(int id) {
		iData = id;
	}
	
	public void displayLinks() {
		System.out.println(iData);
	}
}

class LinkList{
	
	private Links first;
	
	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void displayList() {
		
		Links current = first;
		
		while(current != null) {
			current.displayLinks();
			current = current.next;
		}
	}
	
	public Links delete(int key) {
		
		Links current = first;
		Links previous = first;
		
		while(key != current.iData) {
			
			if(current.next == null)
				return null;
			
			previous = current;
			current = current.next;
		}
		
		previous.next = current.next;
		return current;
	}
	
	public boolean insertAfter(int key , int newData) {
		
		Links current = first;
		
		while(key != current.iData) {
			
			if(current.next == null)
				return false;
			current = current.next;
		}
		
		Links link = new Links(newData);
		link.next = current.next;
		current.next = link;
		return true;
		
	}
	
	public Links find(int key) {
		
		Links current = first;
		while(current != null) {
			if(current.iData == key)
				return current;
			
			current = current.next;
		}
		return null;
	}
	
	public void insertFirst(int id) {
		
		Links link = new Links(id);
		link.next = first;
		first = link;
	}
}
