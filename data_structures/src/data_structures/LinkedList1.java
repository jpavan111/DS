package data_structures;

public class LinkedList1 {

	Node head;
	Node tail;
	Node current;
	Node prev;

	public void addNode(int data) {
		Node n1 = new Node();

		if (head == null) {
			n1.data = data;
			n1.next = null;
			head=n1;
			tail=n1;
		} else {
            n1.data=data;
            n1.next=null;
            tail.next=n1;   //here we actually save address of new node in last created node
            tail=n1;       //after that tail will continue pointing to last node
		}
	}
	
	public void display() {
		current=head;
		while(current!=null) {
			
			System.out.print(" "+current.data);
			current=current.next;  //here we move cursor to next
		}   
		
	}
	
	public void deleteLast() {
		
		current=head;
		int length=1;
		int count=1;
		while(current.next!=null) {
			length++;
			current=current.next;
		}
		
		current=head;
		
		while(count!=length-1) {
			count++;
			current=current.next;
		}
		
		current.next=null;
		
	}
	
	public void deleteFirst() {
		
		if(head!=null) {
			head=head.next;
		}
		else {
			System.out.println("list empty");
		}
		
	}
	
	public void deletePosition(int pos) {
		current=head;
		int p=1;
		int a=1;
		while(p!=pos) {
			current=current.next;
			p++;
		}
		current=current.next;
		prev=head;
		while(a!=pos-1) {
			a++;
			prev=prev.next;
		}
		prev.next=current;
	}
	
	public void reverse() {
		current=head;
		
	}

	public static void main(String[] args) {
      LinkedList1 l1=new LinkedList1();
		l1.addNode(10);
        l1.addNode(20);
		l1.addNode(30);
		l1.addNode(40);
		l1.display();
		//l1.deleteLast();
		//l1.display();
		//l1.deleteFirst();
		//System.out.println(l1.head.data);
		//System.out.println(l1.tail.data);
		
		//l1.deleteLast();
		//System.out.println();
		//l1.display();
	
		//l1.deleteLast();
		//System.out.println("");	
		//l1.display();
		
		//l1.deleteFirst();
		//l1.display();
		
		//l1.deletePosition(3);
		//l1.display();
		
		//l1.reverse();
		

	}

}

class Node {
	int data;
	Node next;

}
