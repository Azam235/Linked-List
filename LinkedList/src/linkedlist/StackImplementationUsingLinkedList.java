package linkedlist;

class SNode{
	int data;
	SNode next;
	SNode(int data){
		this.data=data;
	}
}

class Stack{
	SNode top;
	
	public boolean isStackEmpty() {
		if(top==null){
			System.out.println("Stack is empty"); 
			return true;
		}
		return false;
	}
	
	public void push(int data) {
		SNode node=new SNode(data);
		if(node==null) {
			System.out.println("heap is full /stack overflow");
			return;
		}
		node.next=top;
		top=node;
	}
	
	public void pop() {
		if(isStackEmpty()) {
			return;
		}
		top=top.next;
	}
	
	public void showStack() {
		if(isStackEmpty()) {
			return;
		}
		SNode temp=top;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println("");
	}
}

public class StackImplementationUsingLinkedList {
	public static void main(String[] s) {
		Stack obj=new Stack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.pop();
		obj.pop();
		
		obj.showStack();
	}
}
