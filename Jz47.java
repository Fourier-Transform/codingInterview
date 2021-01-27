public class Jz47 {
    public int Sum_Solution(int n) {
        boolean x = (n > 1) && (n += Sum_Solution(n - 1)) > 0;
        return n;
    }   
}