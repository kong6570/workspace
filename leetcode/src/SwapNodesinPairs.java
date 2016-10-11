/**
 * Created by zhangjingzhuan on 2016/10/10.
 */
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode cur = head;
        ListNode pre = null;
        ListNode swapNext = null;
        while (cur != null && cur.next != null){//can swap
            swapNext = cur.next.next;
            if(pre != null){
                pre.next = cur.next;
            }else {
                head = cur.next;
            }
            cur.next.next = cur;
            cur.next = swapNext;
            pre = cur;
            cur = swapNext;
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }
}
