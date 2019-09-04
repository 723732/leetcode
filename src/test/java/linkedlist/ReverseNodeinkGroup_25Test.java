package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseNodeinkGroup_25Test {

    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(3);
    ListNode a4 = new ListNode(4);
    ListNode a5 = new ListNode(5);

    ListNode b1 = new ListNode(4);
    ListNode b2 = new ListNode(5);

    @Test
    public void reverseKGroup() {
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        b1.next = b2;
        ReverseNodeinkGroup_25 b = new ReverseNodeinkGroup_25();
//        b.reverseKGroup(a1, 2);
        b.reverseKGroup(b1, 2);
    }
}