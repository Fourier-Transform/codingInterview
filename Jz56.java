/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode head = new ListNode(0);
        head.next = pHead;
        ListNode last = head;
        while(last.next != null && last.next.next != null){
            if(last.next.val == last.next.next.val){
                ListNode start = last.next;
                ListNode end = start.next;
                while(end.next!=null && end.next.val == start.val){
                    end = end.next;
                }
                last.next = end.next;
            }else{
                last = last.next;
            }
        }
        return head.next;
    }
}