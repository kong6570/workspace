import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangjingzhuan on 2016/9/28.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        ListNode currentNode = head;
        int listLength = 0;
        while (currentNode != null){
            listLength++;
            currentNode = currentNode.next;
        }
        if(n>listLength){
            return null;
        }

        if(listLength-n == 0){
            return head.next;
        }
        //delete target.next
        ListNode target = null;
        for(int i=1;i<=(listLength-n);i++){
            if (i == 1){
                target = head;
            }else {
                target = target.next;
            }
        }
        target.next = target.next.next;

        return head;
    }
}
class ListNode{
    public int val;
    public ListNode next = null;
    public ListNode(int x){
        val = x;
    }

    public int getVal() {
        return val;
    }

    public ListNode getNext() {

        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
