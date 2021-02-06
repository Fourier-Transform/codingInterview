public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n == 0 || m == 0) return -1;
        return rec(n,m);
    }
    
    public int rec(int n, int m){
        if(n == 1) return 0;
        int x = rec(n - 1, m);
        return (m%n + x)%n;
    }
}