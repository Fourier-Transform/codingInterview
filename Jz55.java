/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Jz55 {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode oneStep = pHead;
        ListNode twoStep = pHead;
        while(twoStep != null){
            oneStep = oneStep.next;
            twoStep = twoStep.next;
            if(twoStep != null){
                twoStep = twoStep.next;
            }else{
                return null;
            }
            if(oneStep == twoStep){
                oneStep = pHead;
                while(oneStep != twoStep){
                    oneStep = oneStep.next;
                    twoStep = twoStep.next;
                }
                return oneStep;
            }
        }
        return null;
    }
}