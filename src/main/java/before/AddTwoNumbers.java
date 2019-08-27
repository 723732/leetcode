package before;

import before.ListNode;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//        Example:
//
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.
public class AddTwoNumbers {

    public long nodeToLong(ListNode l){
        long sum = 0;
        long i = 1;

        if(l == null)
            return 0;

        while(l != null){
            sum = ((long) l.val)*i + sum;
            l = l.next;
            i = i * 10;
        }

        return sum;
    }

    public ListNode LongToNode(long value){

        ListNode l = new ListNode(-1);
        l.val = (int)(value % 10);
        l.next = null;
        value = value/10;

        ListNode l1 = l;

        while(value != 0){
            ListNode  next = new ListNode(-1);
            next.val = (int)(value % 10);
            value = value/10;
            next.next = null;
            l1.next = next;
            l1 = l1.next;
        }

        return l;
    }

    public  ListNode addTwoNumbers1(ListNode l1, ListNode l2){

        long a = nodeToLong(l1);
        long b = nodeToLong(l2);
        a = a + b;

        ListNode L = LongToNode(a);

        return L;

    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2){

        ListNode l = new ListNode(-1);
        l.next = null;
        ListNode temp = l;
        int num = 0;

        while(l1 != null || l2 != null){
            ListNode cnext = new ListNode(-1);
            cnext.next = null;

            if(l1 != null && l2 == null){
                cnext.val = l1.val + num;
                l1 = l1.next;
            }
            else if(l1 == null && l2 != null){
                cnext.val = l2.val + num;
                l2 = l2.next;
            }
            else if(l1 != null && l2 != null){
                cnext.val = l1.val + l2.val + num;
                l1 = l1.next;
                l2 = l2.next;
            }

            if(cnext.val > 9){
                num = 1;
                cnext.val = cnext.val%10;
            }
            else
                num = 0;

            temp.val = cnext.val;

            //结尾，只要有一个不为空就会产生下一个；如果两个都为空，分两种情况，两个都为空无进位，不产生下一个，两个都为空有进位，产生下一个val为1
            if(l1 != null || l2 != null){
                temp.next = cnext;
                temp = temp.next;
            }

            if(l1 == null && l2 == null && num > 0){
                temp.next = cnext;
                temp.next.val = 1;
            }
        }

        return l;
    }
}
//思路：1.先从链表中读出转化为整数再相加，结果再存入链表；
//2.直接按链表相加，遇十进一

//1.int 四字节32位，长度有限制，用long也不行，第一种思路始终有长度限制，否定
