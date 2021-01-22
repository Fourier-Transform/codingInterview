public class Jz11 {
    public int NumberOf1(int n) {
        String str = Integer.toBinaryString(n);
        int ret = 0;
        for(char i: str.toCharArray()){
            if(i == '1') ret++;
        }
        return ret;
    }
}