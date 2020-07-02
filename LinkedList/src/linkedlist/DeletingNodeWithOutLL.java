package linkedlist;

public class DeletingNodeWithOutLL {
	
	public static void deleteNode(Node node) {
		Node temp=node.next;;
		node.data=temp.data;
		node.next=temp.next;
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
		l.show();
		Node x=l.head.next.next.next;
		deleteNode(x);
		l.show();
	}
}
