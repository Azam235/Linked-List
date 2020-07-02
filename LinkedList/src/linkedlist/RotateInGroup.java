package linkedlist;

public class RotateInGroup {
	
	public static Node rotateInGroup(Node head,int n) {
		Node curr=head;
		Node next=null;
		Node prev=null;
		int count=0;
		while(curr!=null && count<n) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		}
		curr.next = rotateInGroup(curr, n);
		return prev;
	}
	
	public static void print(Node head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	
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
		l.insert(9);l.show();
		Node tempHead;
		tempHead=rotateInGroup(l.head, 3);
		System.out.println(tempHead);
		print(tempHead);
	}
}
