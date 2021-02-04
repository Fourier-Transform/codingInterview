public class Jz37 {
    public int GetNumberOfK(int [] array , int k) {
        int count = 0;
        int l = 0, r = array.length - 1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(array[mid] == k){
                int targetL = mid;
                int targetR = mid;
                while(targetL >= 0 && array[targetL] == k){
                    targetL--;
                }
                targetL++;
                while(targetR <= array.length - 1 && array[targetR] == k){
                    targetR++;
                }
                targetR--;
                return targetR - targetL + 1;
            }else if(array[mid] > k){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return 0;
    }
}