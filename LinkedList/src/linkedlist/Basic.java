package linkedlist;

class Node{
	int data;
	Node next;
}

class Linkedlist{
	Node head;
	
	public void insert(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head=node;
		}
		else {
			Node n=new Node();
			n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	
	public void insertAtStart(int data) {
		Node node=new Node();
		node.data=data;
		node.next=head;
		head=node;
	}
	
	public void insertATIndex(int index,int data) {
		Node node=new Node();
		node.data=data;
		Node n=head;
		if(index==0) {
			insertAtStart(data);
		}
		else {
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}
	
	public void deleteAt(int index) {
		if(index==0) {
			head=head.next;
		}
		else {
			Node n=head;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			n.next=n.next.next;
		}
	}
	
	public void show() {
		Node n=new Node();
		n=head;
		while(n.next!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println(n.data);
	}
	
	public void findMiddle() {
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println("middle element of the linked list is "+slow.data);
	}
	
	public void reverseLinkedList() {
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	
	public void rotate(int n) {
		Node temp1=head;
		for(int i=0;i<n-1;i++) {
			temp1=temp1.next;
		}
		Node curr=temp1.next;
		Node tempHead=temp1.next;
		temp1.next=null;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=head;
		head=tempHead;
	}
	
	public Node reverseInGroups(Node head, int k)
	{
		if (head == null) {
			return null;
		}

		Node current = head;
		Node next=null;
		Node prev = null;
		int count = 0;
		while (current != null && count++ < k)
		{
			next = current.next;

			current.next = prev;

			prev = current;

			current = next;
		}

		head.next = reverseInGroups(current, k);
		return prev;
	}
	
	public void print(Node thead) {
		while(thead!=null) {
			System.out.print(thead.data+" ");
			thead=thead.next;
		}
	}
	
}

public class Basic {
	public static void main(String[] s) {
		Linkedlist l=new Linkedlist();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.insert(6);
		l.insert(7);
		l.insert(8);
		l.insert(9);
		l.insert(65);
//		l.insert(54);
//		l.insertAtStart(0);
//		l.insertAtStart(1);
//		l.insertAtStart(3);
//		l.insertAtStart(4);
//		l.insertATIndex(3, 15);
//		l.deleteAt(4);
//		l.show();
//		System.out.println(" ");
//		l.rotate(3);
//		System.out.println(" ");
//		l.show();
		Node tempHead=l.reverseInGroups(l.head, 3);
		l.print(tempHead);
	}
}
