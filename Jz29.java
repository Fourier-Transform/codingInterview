import java.util.*;
public class Jz29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(input.length < k) return new ArrayList<Integer>();
        Queue<Integer> queue = new PriorityQueue<Integer>();
        for(int i: input){
            queue.offer(i);
        }
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for(int i = 0; i < k; i++){
            ret.add(queue.poll());
        }
        return ret;
    }
}