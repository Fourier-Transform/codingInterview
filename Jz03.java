/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Jz03 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null) return new ArrayList<Integer>();
        ListNode last = null;
        ListNode ptr = listNode;
        ListNode next = ptr.next;
        while(ptr != null){
            ptr.next = last;
            last = ptr;
            ptr = next;
            if(ptr != null) next = ptr.next;
        }
        ListNode reverseList = last;
        ArrayList<Integer> ret = new ArrayList<Integer>();
        while(reverseList!=null){
            ret.add(reverseList.val);
            reverseList = reverseList.next;
        }
        return ret;
    }
}