/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
import java.util.*;
public class Jz25 {
    public RandomListNode Clone(RandomListNode pHead)
    {
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode head = pHead;
        RandomListNode retList = new RandomListNode(-1);
        RandomListNode retHead = retList;
        while(pHead != null){
            retList.next = new RandomListNode(pHead.label);
            retList = retList.next;
            map.put(pHead, retList);
            pHead = pHead.next;
        }
        retList = retHead.next;
        pHead = head;
        while(retList != null){
            if(pHead.random == null){
                retList.random = null;
            }else{
                retList.random = map.get(pHead.random);
            }
            retList = retList.next;
            pHead = pHead.next;
        }
        return retHead.next;
    }
    
    
}