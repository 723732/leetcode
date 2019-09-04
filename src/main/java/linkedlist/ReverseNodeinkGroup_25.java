package linkedlist;
//25. K 个一组翻转链表
//        给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
//
//        k 是一个正整数，它的值小于或等于链表的长度。
//
//        如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
//
//        示例 :
//
//        给定这个链表：1->2->3->4->5
//
//        当 k = 2 时，应当返回: 2->1->4->3->5
//
//        当 k = 3 时，应当返回: 3->2->1->4->5
//
//        说明 :
//
//        你的算法只能使用常数的额外空间。
//        你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

import java.util.ArrayList;
import java.util.List;

public class ReverseNodeinkGroup_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null)
            return head;
        List<List<ListNode>> nodes = new ArrayList<>();
        while (head != null){
            int count = 0;
            List<ListNode> tmp = new ArrayList<>();
            while (count < k){
                if (head == null) break;
                tmp.add(head);
                head = head.next;
                count++;
            }
            nodes.add(tmp);
        }

        for (List<ListNode> list: nodes){
            if (list.size() < k) break;
            for (int i = 1; i < list.size(); i++){
                list.get(i).next = list.get(i-1);
            }
        }

        for (int i = 0; i < nodes.size()-1; i++){
            if(nodes.get(i+1).size() < k)
                nodes.get(i).get(0).next = nodes.get(i+1).get(0);
            else
                nodes.get(i).get(0).next = nodes.get(i+1).get(nodes.get(i+1).size()-1);
        }

        head = nodes.get(0).get(nodes.get(0).size()-1);
        if(nodes.size() == 1)
            nodes.get(0).get(0).next = null;
        return head;
    }

}
