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

    public  ListNode addTwoNumbers(ListNode l1, ListNode l2){

        long a = nodeToLong(l1);
        long b = nodeToLong(l2);
        a = a + b;

        ListNode L = LongToNode(a);

        return L;

    }
}
//思路：1.先从链表中读出转化为整数再相加，结果再存入链表；
//2.直接按链表相加，遇十进一

//1.int 四字节32位，长度有限制，用long也不行，第一种思路始终有长度限制，否定
