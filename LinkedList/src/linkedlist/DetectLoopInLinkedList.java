package linkedlist;


public class DetectLoopInLinkedList {
	
	public static boolean detectLoop(Node head) {
//		HashSet<Node> h = new HashSet<Node>();
//		while(head!=null) {
//			if(h.contains(head)) {
//				return true;
//			}
//			h.add(head);
//			head=head.next;
//		}
		Node node=head;
		Node fast=node;
		Node slow=node;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		
		return false;
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
		l.insert(9);
		l.insert(10);
		l.head.next.next.next.next.next=l.head; //create a loop for testing
		if(detectLoop(l.head)){
			System.out.println("loop is present");
		}
		else{
			System.out.println("loop is not present");
		}
	}
}
