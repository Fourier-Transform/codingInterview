import java.util.ArrayList;
public class Jz41 {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        //TODO SUM == 1 etc.
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        ArrayList<Integer> temp;
        int l = 1, r = 2, total = 3;
        while(r < sum){
            if(total == sum){
                // add ret temp;
                int start = l;
                temp = new ArrayList<>();
                while(start <= r){
                    temp.add(start);
                    start++;
                }
                ret.add(new ArrayList<Integer>(temp));
                total -=l;
                l++;
            }else if(total < sum){
                r++;
                total += r;
            }else{
                total -= l;
                l++;
            }
        }
        return ret;
    }
}