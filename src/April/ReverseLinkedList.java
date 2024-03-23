package April;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode prev=null,temp;
        //return Recursivelist(head,null);
        while(head!=null)
        {
            temp = head.next;
            head.next=prev;
            prev=head;//System.out.println(curr.val);
            head=temp;

        }
        return prev;
    }

    public ListNode Recursivelist(ListNode head,ListNode prev){
        if(head==null)
        {
            return prev;
        }

        ListNode temp = head.next;
        head.next=prev;
        return Recursivelist(temp,head);
    }

    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ReverseLinkedList rl = new ReverseLinkedList();
        ListNode reversedListHead = rl.reverseList(l1);

        //System.out.println()

        // Printing the reversed linked list
        while (reversedListHead != null) {
            System.out.print(reversedListHead.val + " ");
            reversedListHead = reversedListHead.next;
        }
    }
}
