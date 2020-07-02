package linkedlist;

public class YShapedLinkedList {
	
	public static int intersectingNode(Node head1, Node head2) {
		int c1=length(head1);
		int c2=length(head2);
		int d;
		if(c1>c2) {
			d=c1-c2;
			return findIntersection(d,head1,head2);
		}
		else {
			d=c2-c1;
			return findIntersection(d,head2,head1);
		}
	}
	
	public static int findIntersection(int d,Node head1,Node head2) {
		for(int i=0;i<d;i++) {
			head1=head1.next;
		}
		while(head1!=null && head2 !=null) {
			if(head1.data==head2.data) {
				return head1.data;
			}
			head1=head1.next;
			head2=head2.next;
		}
		return -1;
	}
	
	public static int length(Node head) {
		int count=0;
		while(head!=null) {
			count++;
			head=head.next;
		}
		return count;
	}
	
	public static void main(String[] s) {
		Linkedlist l1=new Linkedlist();
		Linkedlist l2=new Linkedlist();
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);
		l1.insert(6);
		l1.insert(16);
		
		l2.insert(6);
		l2.insert(7);
		l2.insert(5);
		l2.insert(15);
		l2.insert(16);
		
		System.out.println("intersecting node data is "+intersectingNode(l1.head,l2.head));
	}
}
