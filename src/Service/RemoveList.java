package Service;

public class RemoveList {

	public static void main(String[] args) {
		 ListNode headnode=new ListNode(3);
		 headnode.next=new ListNode(5);
		 headnode.next.next=new ListNode(1);
		 headnode.next.next.next=new ListNode(7);
		 headnode.next.next.next.next=new ListNode(2);
		 ListNode tmp=headnode;
		 tmp.next=tmp.next.next;
		 
		 
		 ListNode node=headnode;
		 while(node!=null)
		 {
			 System.out.println(node.val);
			 node=node.next;
		 }
		 

	}

}
