public class Jz35 {
    int count = 0;
    int[] temp;
    public int InversePairs(int [] array) {
        if(array == null || array.length == 0) return -1;
        temp = new int[array.length];
        merge(array, 0, array.length - 1);
        return count;
    }
    
    public void merge(int[] num, int l, int r){
        if(l >= r) return;
        int mid = l + (r - l)/2;
        merge(num, l, mid);
        merge(num, mid + 1, r);
        int i = l, j = mid + 1, k = l;
        while(i <= mid && j <= r){
            if(num[i] <= num[j]){
                temp[k++] = num[i++];
            }else{
                temp[k++] = num[j++];
                count = (count + mid - i + 1)%1000000007;
            }
        }
        
        while(i <= mid){
            temp[k++] = num[i++];
        }
        while(j <= r){
            temp[k++] = num[j++];
        }
        for(int x = l; x <= r; x++){
            num[x] = temp[x];
        }
    }
}