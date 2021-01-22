public class Jz13 {
    public void reOrderArray(int [] array) {
        boolean flag = false;
        for(int i = 0; i < array.length; i++){
            flag = false;
            for(int j = i; j < array.length; j++){
                if(array[j]%2 == 1){
                    //swap
                    for(int k = j; k > i; k--){
                        int temp = array[k];
                        array[k] = array[k - 1];
                        array[k - 1] = temp;
                    }
                    flag = true;
                    break;
                }
            }
            if(flag == false) break;
        }
    }
}