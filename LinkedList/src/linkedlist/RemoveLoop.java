package linkedlist;

import java.util.HashSet;

public class RemoveLoop {
	
	public static void removeLoop(Node head) {
		Node node=head;
		Node fast=node;
		Node slow=node;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				break;
			}
		}
		if(slow==fast) {
			slow=node;
			while(slow.next!=fast.next) {
				slow=slow.next;
				fast=fast.next;
			}
			fast.next=null;
		}
	}
	
	public static void main(String[] s) {
		Linkedlist l=new Linkedlist();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.head.next.next.next.next.next=l.head.next; //create a loop for testing
		removeLoop(l.head);
		System.out.println(l.head.next.next.next.next.next);
		l.show();
	}
}
