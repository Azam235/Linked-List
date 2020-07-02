package linkedlist;



public class FindingMiddleElementInLLGFG1 {
	public static void main(String[] s) {
		Linkedlist l=new Linkedlist();
		l.insertAtStart(5);
		l.insertAtStart(6);
		l.insertAtStart(7);
		l.insertAtStart(8);
		l.insertAtStart(9);
		l.show();
		l.reverseLinkedList();
		System.out.println(" ");
		l.show();
		l.findMiddle();
	}
}
