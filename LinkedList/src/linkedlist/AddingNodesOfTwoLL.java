package linkedlist;

public class AddingNodesOfTwoLL {
	Node head1,head2,result,curr;
	int carry;
	
	public int getSize(Node node) {
		int count=0;
		while(node!=null) {
			count++;
			node=node.next;
		}
		return count;
	}
	
	void push(int val, int list)  
	    { 
	        Node newnode = new Node(); 
	        if (list == 1)  
	        { 
	        	newnode.data=val;
	            newnode.next = head1; 
	            head1 = newnode; 
	        }  
	        else if (list == 2)  
	        { 
	        	newnode.data=val;
	            newnode.next = head2; 
	            head2 = newnode; 
	        }  
	        else 
	        { 
	        	newnode.data=val;
	            newnode.next = result; 
	            result = newnode; 
	        } 
	  
	    }
	
	public void addSameSize(Node n,Node m) {
		if(n==null) {
			return;
		}
		addSameSize(n.next,m.next);
		int sum=n.data+m.data+carry;
		carry=sum/10;
		sum=sum%10;
		push(sum,3);
	}
	
	public void propagateCarry(Node head1) {
		if(head1!=curr) {
			propagateCarry(head1.next);
			int sum=carry+head1.data;
			carry=sum/10;
			sum=sum%10;
			push(sum,3);
		}
	}
	 
	public void addlists() {
		 if(head1==null) {
			 result=head2;
			 return;
		 }
		 if(head2==null) {
			 result=head1;
			 return;
		 }
		 
		 int size1=getSize(head1);
		 int size2=getSize(head2);
		 
		 if(size1==size2) {
			 addSameSize(head1,head2);
		 }
		 else {
			 if(size1<size2) {
				 Node temp=head1;
				 head1=head2;
				 head2=temp;
			 }
			 int diff=Math.abs(size1-size2);
			 Node temp=head1;
			 while(diff-->=0) {
				 curr=temp;
				 temp=temp.next;
			 }
			 addSameSize(curr,head2);
			 propagateCarry(head1);
		 }
		 if(carry>0) {
				push(carry,3);
			}
	 }
	
	public void printList(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println("");
	}
	 
	 public static void main(String[] s) {
		AddingNodesOfTwoLL obj=new AddingNodesOfTwoLL();
		obj.head1=null;
		obj.head2=null;
		obj.result=null;
		obj.carry=0;
		int x[]= {9,9,9};
		int y[]= {1,8};
		for(int i=x.length-1;i>=0;i--) {
			obj.push(x[i],1);
		}
		for(int i=y.length-1;i>=0;i--) {
			obj.push(y[i],2);
		}
//		obj.printList(obj.head1);
//		obj.printList(obj.head2);
		obj.addlists();
		obj.printList(obj.result);
	}
}
