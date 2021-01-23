import java.util.ArrayList;
public class Jz23 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if(sequence.length == 0) return false;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < sequence.length; i++){
            list.add(sequence[i]);
        }
        return  recur(list);
    }

    public boolean recur(ArrayList<Integer> list){
        if(list.size() == 2 || list.size() == 1 || list.size() == 0) return true;
        int pivot = list.get(list.size() - 1), index = list.size() - 1;
        boolean flag1 = false, flag2 = false;
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) >= pivot && flag1 == false) {
                flag1 = true;
                index = i;
            }
            if(list.get(i) < pivot && flag1 == true) {
                flag2 = true;
                break;
            }
        }
        if(flag1 == true && flag2 == true) return false;
        else return recur(new ArrayList<Integer>(list.subList(0, index))) && recur(new ArrayList<Integer>(list.subList(index, list.size() - 1)));
    }
}