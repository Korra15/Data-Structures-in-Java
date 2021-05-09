package basic;

public class Singly_ll {
	
	public class Node{
		int data;
		Node next; 
	
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
		
	Node head;
	
	
	boolean isEmpty() {
		if(head==null)
			return true;
		else
			return false;
	}
	
	
	public void add(int data) {
		Node newNode= new Node(data);
		if(isEmpty()) 
			head=newNode;
		Node temp=head;			
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.next=null;
	}
	
	
	public void delete(int data) {
		if(isEmpty())
			System.out.println("List is Empty, Deletion is not possible");
		else
		{
			Node tmp1=head;
			Node tmp2;
			while(tmp1.data!=data) {
				tmp1=tmp1.next;
				tmp2=tmp1;
			}
			if (tmp1.next==null)
			{
				System.out.println("Element not found, Deletion is not possible");
				return;
			}
		}
		
	}
	
	
	public void print_list() {
		if(isEmpty())
			System.out.println("List is Empty");
		else
		{
			Node temp=head;			
			while(temp.next!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
	
}
