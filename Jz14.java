/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Jz14 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null) return null;
        ListNode list = head;
        int count = 0;
        while(list != null){
            count++;
            list = list.next;
        }
        if(k > count) return null;
        count -= k;
        while(count >= 1){
            head = head.next;
            count--;
        }
        return head;
    }
}