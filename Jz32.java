import java.util.*;

public class Jz32 {
    public String PrintMinNumber(int [] numbers) {
        StringBuilder builder = new StringBuilder();
        quickSort(numbers, 0, numbers.length - 1);
        for(int i: numbers){
            builder.append(i);
        }
        return builder.toString();
        
    }
    
    void quickSort(int[] numbers, int l, int r){
        if(l >= r) return;
        int pivot = numbers[r];
        int i = l - 1;
        int j = l;
        while(j < r){
            if(compare(numbers[j], pivot)){
                int temp = numbers[j];
                numbers[j] = numbers[++i];
                numbers[i] = temp;
            }
            j++;
        }
        numbers[r] = numbers[++i];
        numbers[i] = pivot;
        quickSort(numbers, l, i - 1);
        quickSort(numbers, i + 1, r);
    }
    
    
    boolean compare(int a, int b){
        return (Integer.toString(a) + Integer.toString(b)).compareTo(Integer.toString(b) + Integer.toString(a))>0?false:true;
    }
}