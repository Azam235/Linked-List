package linkedlist;

public class MergeSortedLL {
	
	public static Node mergeLL(Node a,Node b) {
		if(a==null) {
			return b;
		}
		if(b==null) {
			return a;
		}
		
		Node result;
		if(a.data<b.data) {
			result=a;
			result.next=mergeLL(a.next,b);
		}
		else {
			result=b;
			result.next=mergeLL(a,b.next);
		}
		return result;
	}
	
	public static void main(String[] s) {
		Linkedlist l1=new Linkedlist();
		Linkedlist l2=new Linkedlist();
		
		l1.insert(1);
		l1.insert(3);
		l1.insert(5);
		l1.insert(7);
		l1.insert(9);
		
		l2.insert(2);
		l2.insert(4);
		l2.insert(6);
		l2.insert(8);
		l2.insert(10);
		Node node;
		node=mergeLL(l1.head,l2.head);
		l1.print(node);
	}
}
