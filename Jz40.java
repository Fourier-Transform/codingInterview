//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
import java.util.*;
public class Jz40 {
    //Retry
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i: array){
            if(set.contains(i)){
                set.remove(i);
            }else{
                set.add(i);
            }
        }
        Iterator<Integer> it = set.iterator();
        num1[0] = it.next();
        num2[0] = it.next();
    }
}