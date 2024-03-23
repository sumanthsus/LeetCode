package April;

import java.util.ArrayList;
import java.util.Objects;

public class PalindromelInkedList {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> newarr = new ArrayList<>();
        int i=0;
        while(head!=null)
        {
            newarr.add(i,head.val);
            head=head.next;
            i++;
        }
        System.out.println(newarr.toString());
        i=0;
        int j=newarr.size()-1;
        while(i<j)
        {
            if(!Objects.equals(newarr.get(i), newarr.get(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        PalindromelInkedList pl = new PalindromelInkedList();

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(1);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        System.out.println(pl.isPalindrome(l1));

    }
}
