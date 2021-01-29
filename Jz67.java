public class Jz67 {
    public int cutRope(int target) {
        int a = target/3;
        int b = target%3;
        if(target == 3) return 4;
        if(target == 2) return 2;
        if(b == 0) return (int)Math.pow(3, a);
        if(b == 1) return ((int)Math.pow(3, a - 1)*4);
        if(b == 2) return ((int)Math.pow(3, a)*2);
        return 0;
    }
}