import org.junit.Test;


public class AddTwoNumbersTest {

    int[] a = {1,9,9,9,9,9,9,9,9,9,9};
    ListNode l1 = new ListNode(a[0]);
    ListNode l = l1;

    @Test
    public void addTwoNumbers() {

        for(int i = 1; i < a.length; i++){
            ListNode next = new ListNode(a[i]);
            next.next = null;
            l.next = next;
            l = l.next;
        }

        ListNode l2 = new ListNode(9);

        AddTwoNumbers a = new AddTwoNumbers();
        ListNode b = a.addTwoNumbers(l1, l2);

        while(b != null){
            System.out.println(b.val);
            b = b.next;
        }

    }

    @Test
    public void nodeToInt() {
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);

        l11.next = l12;
        l12.next = l13;

        AddTwoNumbers a = new AddTwoNumbers();
        long b = a.nodeToLong(l11);
        System.out.println(b);
    }

    @Test
    public void intToNode() {

        AddTwoNumbers a = new AddTwoNumbers();
        ListNode b = new ListNode(-1);
        b = a.LongToNode(234);
        System.out.println(b.val);
        System.out.println(b.next.val);
        System.out.println(b.next.next.val);

    }

}