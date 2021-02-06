public class Jz45 {
    public boolean IsContinuous(int [] numbers) {
        if(numbers == null || numbers.length == 0) return false;
        int[] poker = new int[14];
        int jokers = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0) jokers++;
            else if(poker[numbers[i]] == 1){
                return false;
            }else{
                poker[numbers[i]] = 1;
            }
        }
        int start = 0, end = 0;
        for(int i = 1; i < poker.length; i++){
            if(poker[i] == 1){
                if(start == 0){
                    start = i;
                }
                end = i;
            }
        }
        if(end - start <= 4) return true;
        else return false;
    }
}