package linkedlist;
//206. 反转链表
//        反转一个单链表。
//
//        示例:
//
//        输入: 1->2->3->4->5->NULL
//        输出: 5->4->3->2->1->NULL
public class ReverseLinkedList_206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode nextnode = head.next;
        head.next = null;

        while (nextnode != null){
            ListNode nextmp = nextnode.next;//4
            nextnode.next = head;//3->2
            head = nextnode;//3
            if (nextmp == null) break;
            nextnode = nextmp;//4
        }

        return nextnode;
    }
}
