import java.util.*;
public class Jz42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>(){
            @Override
            public int compare(int[] l, int[]r){
                return l[0]*l[1] - r[0]*r[1];
            }
        });
        
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < array.length; i++){
            int temp = sum - array[i];
            if(set.contains(temp)){
                int[] arr = new int[2];
                arr[0] = temp;
                arr[1] = array[i];
                queue.add(arr);
            }else{
                set.add(array[i]);
            }
        }
        
        ArrayList<Integer> ret = new ArrayList<>();
        if(!queue.isEmpty()){
            ret.add(queue.peek()[0]);
            ret.add(queue.peek()[1]);
        }
        return ret;
    }
}