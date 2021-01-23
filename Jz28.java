import java.util.*;
public class Jz28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean flag_ret = false;
        int ret = 0;
        for(int i: array){
            if(map.containsKey(i)){
                int temp = map.get(i) + 1;
                map.replace(i, temp);
            }else{
                map.put(i, 1);
            }
        }
        for(Integer i: map.keySet()){
            if(map.get(i) > (array.length)/2){
                ret = i;
                flag_ret = true;
                break;
            }
        }
        if(flag_ret) return ret;
        else return 0;
    }
}