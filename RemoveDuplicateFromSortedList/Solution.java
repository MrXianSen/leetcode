public class Solution{
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(3);
        head = new Solution().deleteDuplicates(head);
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
	}

	public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        ListNode q = p;
        while(q != null && p != null){
        	if(p.val != q.val){
        		p.next = q;
        		p = p.next;
        	}
        	q = q.next;
        }
        if(p != q){
        	p.next = null;
        }
        return head;
    }
}
