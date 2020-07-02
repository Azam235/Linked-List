package linkedlist;

class QNode{
	int data;
	QNode next;
	public QNode(int data) {
		this.data=data;
	}
}

class Queue{
	QNode front,rear;
	
	public boolean isEmpty() {
		if(front==null) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int data) {
		QNode node=new QNode(data);
		if(front==null) {
			front=rear=node;
			return;
		}
		rear.next=node;
		rear=node;
	}
	
	public void dequeue() {
		if(front==null) {
			System.out.println("queue is empty");
			return;
		}
		System.out.println("popped element is "+front.data);
		front=front.next;
		if(front==null) {
			rear=null;
		}
	}
	
	public void qshow() {
		QNode temp=front;
		if(isEmpty()) {
			System.out.println("queue is empty");
		}
		else {
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println(" ");
		}
	}
}

public class QueueEmplementationUsingLinkedlist {
	public static void main(String[] s) {
		Queue e=new Queue();
		e.enqueue(1);
		e.enqueue(2);
		e.enqueue(3);
		e.enqueue(4);
		e.qshow();
		
		e.dequeue();
		e.dequeue();
		e.dequeue();
		e.dequeue();
		e.qshow();
	}
}
