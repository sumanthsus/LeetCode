package April;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head,fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow =slow.next;
            fast = fast.next.next;

            if(slow==fast)
            {
                return true;
            }
        }

        return false;



        /*int flag = (int)Math.pow(2,31);

        while(head!=null)
        {
            if(head.val==flag)
            {
                return true;
            }
            head.val = flag;
            head=head.next;
        }

        return false;*/
    }
    public static void main(String[] args)
    {
        LinkedListCycle lc = new LinkedListCycle();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        //l5.next = l2;

        System.out.println(lc.hasCycle(l1));
    }
}
