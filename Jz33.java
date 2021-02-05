public class Jz33 {
    public int GetUglyNumber_Solution(int n) {
        if(n == 0) return 0;
        int[] arr = new int[1690];
        arr[0] = 1;
        int a = 0, b = 0, c = 0;
        int i = 0;
        for(i = 1; i < n; i++){
            int na = arr[a]*2, nb = arr[b]*3, nc = arr[c]*5;
            arr[i] = Math.min(Math.min(na, nb), nc);
            if(arr[i] == na) a++;
            if(arr[i] == nb) b++;
            if(arr[i] == nc) c++;
        }
        return arr[n - 1];
    }
}