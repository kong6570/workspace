import java.util.List;
import java.util.Vector;

/**
 * Created by zhangjingzhuan on 2016/10/9.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return  l1;
        ListNode merge = null;
        ListNode mergeHead = null;
        if(l1.val < l2.val){
            mergeHead = l1;
            l1 = l1.next;
        }else {
            mergeHead = l2;
            l2 = l2.next;
        }
        merge = mergeHead;
        while (l1!=null && l2!=null){
            if(l1.val < l2.val){
                merge.next = l1;
                merge = merge.next;
                l1 = l1.next;
            }else {
                merge.next = l2;
                merge = merge.next;
                l2 = l2.next;
            }
        }
        if(l1 == null){
            merge.next = l2;
        }else {
            merge.next = l1;
        }
        return  mergeHead;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedLists test = new MergeTwoSortedLists();
        ListNode l1 = test.new ListNode(2);
        ListNode l2 = test.new ListNode(1);
        test.mergeTwoLists(l1,l2);
    }
}


