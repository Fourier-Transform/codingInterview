import java.util.*;
public class Jz64 {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        
        ArrayList<Integer> ret = new ArrayList<>();
        if(num.length == 0 || size > num.length || size == 0) return ret;
        int maxNum = 0;
        for(int i = 0; i < size; i++){
            maxNum = Math.max(maxNum, num[i]);
        }
        ret.add(maxNum);
        maxNum = 0;
        for(int i = size; i < num.length; i++){
            for(int j = i - size + 1; j <= i; j++){
                maxNum = Math.max(maxNum, num[j]);
            }
            ret.add(maxNum);
            maxNum = 0;
        }
        return ret;
    }
}