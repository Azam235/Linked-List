package linkedlist;

public class GetNthFromLast {
	
	public static int getNthFromLast(Node head,int n) {
		Node node=head;
		int count=0;
		while(node!=null) {
			count++;
			node=node.next;
		}
		count=count-n;
		if(count<0) {
			return -1;
		}
		node=head;
		for(int i=0;i<count;i++) {
			node=node.next;
		}
		System.out.println(n+"th node from last is "+node.data);
		return 0;
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
		  l.show();
		  int n=11;
		  getNthFromLast(l.head,n);
	  }
}
