package linkedlist;

class TempLL{        //Temporary linked list
	TempNode head;
	
	class TempNode{
		int data;
		TempNode right;
		TempNode down;
		
		public TempNode(int data) {
			this.data=data;
		}
	}

	
	public TempNode push(TempNode head_ref,int data) {
		TempNode new_node=new TempNode(data);
		
		new_node.down=head_ref;
		head_ref=new_node;
		
		return head_ref;
	}
	
	public TempNode merge(TempNode a, TempNode b) {
		if(a==null) {
			return b;
		}
		if(b==null) {
			return a;
		}
		TempNode result;
		if(a.data>b.data) {
			result=a;
			result.down=merge(a.down,b);
		}
		else {
			result=b;
			result.down=merge(a,b.down);
		}
		result.right=null;
		return result;
	}
	
	public TempNode flatten(TempNode root) {
		if(root==null || root.right==null) {
			return root;
		}
		root.right=flatten(root.right);
		root=merge(root,root.right);
		return root;
	}
	
	public void print(TempNode node) {
		while(node!=null) {
			System.out.println(node.data);
			node=node.down;
		}
	}
	
}

public class FlatteningALL {
	public static void main(String[] s) {
		TempLL l=new TempLL();
		
		l.head=l.push(l.head,10);
		l.head=l.push(l.head,15);
		l.head=l.push(l.head,20);
		l.head=l.push(l.head,25);
		
		l.head.right=l.push(l.head.right,12);
		l.head.right=l.push(l.head.right,14);
		l.head.right=l.push(l.head.right,16);

		l.head.right.right=l.push(l.head.right.right,23);
		l.head.right.right=l.push(l.head.right.right,27);
		l.head.right.right=l.push(l.head.right.right,32);
		l.head.right.right=l.push(l.head.right.right,38);

		l.head.right.right.right=l.push(l.head.right.right.right,52);
		l.head.right.right.right=l.push(l.head.right.right.right,55);
		l.head.right.right.right=l.push(l.head.right.right.right,96);
		l.head.right.right.right=l.push(l.head.right.right.right,97);

		l.head=l.flatten(l.head);
		
		l.print(l.head);
	}
}
