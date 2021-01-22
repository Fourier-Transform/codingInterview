/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Jz16 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode list = new ListNode(0);
        ListNode head = list;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                ListNode temp = new ListNode(list1.val);
                list.next = temp;
                list = list.next;
                list1 = list1.next;
            }
            else if(list1.val > list2.val){
                ListNode temp = new ListNode(list2.val);
                list.next = temp;
                list = list.next;
                list2 = list2.next;
                  
            }
        }
        if(list1 != null){
            list.next = list1;
        }
        if(list2 != null){
            list.next = list2;
        }
        return head.next;
    }
}