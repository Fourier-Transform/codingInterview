import java.util.ArrayList;
import java.util.Arrays;
public class Jz51 {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        Arrays.fill(B,1);
        for(int i = 0; i < B.length; i++){
            for(int j = 0; j < B.length; j++){
                if(j != i){
                    B[i] *=A[j];
                }
            }
        }
        return B;
    }
}