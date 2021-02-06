public class Jz46 {
    public int LastRemaining_Solution(int n, int m) {
        if(n == 0 || m == 0) return -1;
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for(int i = 1; i < n; i++){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        temp.next = head;
        temp = head;
        while(temp.next != temp){
            for(int i = 0; i < m - 2; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return temp.val;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val = x;}
}