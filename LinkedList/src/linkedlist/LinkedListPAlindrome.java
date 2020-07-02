package linkedlist;

public class LinkedListPAlindrome {
	public static void main(String[] s) {
		Linkedlist l=new Linkedlist();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(2);
		l.insert(1);

		if(isPalindrome(l.head)) {
			System.out.println("linked list is palindrome");
		}
		else {
			System.out.println("linkedlist is not a palindrome");
		}
	}
	
	public static boolean isPalindrome(Node node) {
		String str="";
		while(node!=null) {
			String x=Integer.toString(node.data);
			str=str.concat(x);
			node=node.next;
		}
		int low=0;
		int high=str.length()-1;
		while(low < high) {
			if(str.charAt(low)!=str.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}
}
