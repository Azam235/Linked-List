package linkedlist;

public class PairWiseSwap {
	
	public static void swapPair(Node head) {
		int k;
		Node temp=head;
		while(temp!=null && temp.next!=null) {
			k=temp.data;
			temp.data=temp.next.data;
			temp.next.data=k;
			temp=temp.next.next;
		}
	}
	
	public static void main(String[] S) {
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
		swapPair(l.head);
		l.show();
	}
}
