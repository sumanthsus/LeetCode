package May;

public class RemoveNodesFromLL {
    public ListNode removeNodes(ListNode head) {
        ListNode newHead = reverseNode(head);

        ListNode prev = null;
        ListNode curr = newHead;
        boolean removedHead = false;

        while(curr != null && curr.next != null) {
            if(curr.next.val >= curr.val) {
                if(prev == null) {
                    newHead = curr.next;
                    removedHead = true;
                } else {
                    prev.next = curr.next;
                }
            } else {
                if (!removedHead) {
                    prev = curr;
                }
            }
            curr = curr.next;
            if(curr.next==null)
            {
                if(prev.val<curr.val)
                {
                    curr=curr.next;
                }
                else
                {
                    prev.next=curr.next;
                }
            }

        }

        return reverseNode(newHead);
    }
    public ListNode reverseNode(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null)
        {
            ListNode tempnext = curr.next;
            curr.next=prev;
            prev=curr;
            curr=tempnext;
        }
        return prev;
    }
    public static void main(String[] args)
    {
        RemoveNodesFromLL rl = new RemoveNodesFromLL();
        // Creating the nodes
        ListNode node5 = new ListNode(5);
        ListNode node2 = new ListNode(2);
        ListNode node13 = new ListNode(13);
        ListNode node3 = new ListNode(3);
        ListNode node8 = new ListNode(8);

        // Linking the nodes
        node5.next = node2;
        node2.next = node13;
        node13.next = node3;
        node3.next = node8;

        ListNode current = rl.removeNodes(node5);

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
