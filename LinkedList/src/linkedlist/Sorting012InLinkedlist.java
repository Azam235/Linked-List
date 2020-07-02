package linkedlist;

public class Sorting012InLinkedlist {
	
	public static Node sort(Node head) {
		if(head==null || head.next==null) 
        { 
            return head; 
        } 
          
        Node zeroD = new Node();  
        Node oneD = new Node();  
        Node twoD = new Node();  
  
       
        Node zero = zeroD, one = oneD, two = twoD;  
        Node curr = head;  
        while (curr!=null)  
        {  
            if (curr.data == 0)  
            {  
                zero.next = curr;  
                zero = zero.next;  
            } 
            else if (curr.data == 1)  
            {  
                one.next = curr;  
                one = one.next;  
            }  
            else 
            {  
                two.next = curr;  
                two = two.next;  
            } 
            curr = curr.next;  
        } 
        zero.next = (oneD.next!=null)  ? (oneD.next) : (twoD.next);  
        one.next = twoD.next;  
        two.next = null; 
        head = zeroD.next; 
        return head; 
    } 
	
	
	public static void main(String[] s) {
		Linkedlist l=new Linkedlist();
		l.insert(0);
		l.insert(1);
		l.insert(2);
		l.insert(2);
		l.insert(1);
		l.insert(0);
		l.insert(0);
		l.insert(1);
		l.insert(1);
		l.insert(0);
		
		l.print(sort(l.head));
	}
}
