import java.util.*;
public class Jz09 {
    public int JumpFloorII(int target) {
        int sum = 0;
        ArrayList<Integer> array = new ArrayList<>(target);
        array.add(0, 1);
        array.add(1, 1);
        for(int i = 2; i <= target; i++){
            sum = 0;
            for(int j = 0; j < i; j++){
                sum+=array.get(j);
            }
            array.add(sum);
        }
        return array.get(target);
    }
}